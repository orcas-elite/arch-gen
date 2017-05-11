package kieker.monitoring.probe.spring.flow;

import java.util.Collections;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kieker.common.logging.Log;
import kieker.common.logging.LogFactory;
import kieker.common.record.controlflow.OperationExecutionRecord;
import kieker.monitoring.core.controller.IMonitoringController;
import kieker.monitoring.core.controller.MonitoringController;
import kieker.monitoring.core.registry.ControlFlowRegistry;
import kieker.monitoring.core.registry.SessionRegistry;
import kieker.monitoring.timer.ITimeSource;
import org.springframework.web.servlet.mvc.WebContentInterceptor;

public class RestInInterceptor extends WebContentInterceptor {

	public static final String SESSION_ID_ASYNC_TRACE = "NOSESSION-ASYNCIN";

	private static Log LOG = LogFactory.getLog(RestInInterceptor.class);

	private static final IMonitoringController CTRLINST = MonitoringController.getInstance();
	private static final ITimeSource TIME = CTRLINST.getTimeSource();
	private static final String VMNAME = CTRLINST.getHostname();
	private static final ControlFlowRegistry CF_REGISTRY = ControlFlowRegistry.INSTANCE;
	private static final SessionRegistry SESSION_REGISTRY = SessionRegistry.INSTANCE;

	private ThreadLocal<ThreadSpecificInterceptedData> threadSpecificInterceptedData = new ThreadLocal<ThreadSpecificInterceptedData>();

	@Override
	public boolean preHandle(final HttpServletRequest request, final HttpServletResponse response, final Object handler) {

        String signature;
        String sessionId = SESSION_REGISTRY.recallThreadLocalSessionId();
        long traceId = -1L;
        long tin;
        final String hostname = VMNAME;
        int eoi;
        int ess;

		if (!CTRLINST.isMonitoringEnabled()) {
			return true;
		}
		
		signature = "public void com.example.intercept.in.RestInInterceptor.interceptIncoming" + request.getMethod() + "Request()";

		final List<String> requestRestHeader = Collections.list(request.getHeaders(RestInterceptorConstants.HEADER_FIELD));

		if ((requestRestHeader == null) || (requestRestHeader.isEmpty())) {
			LOG.debug("No monitoring data found in the incoming request header");
			// LOG.info("Will continue without sending back reponse header");
			traceId = CF_REGISTRY.getAndStoreUniqueThreadLocalTraceId();
			CF_REGISTRY.storeThreadLocalEOI(0);
			CF_REGISTRY.storeThreadLocalESS(1); // next operation is ess + 1
			eoi = 0;
			ess = 0;
		} else {
			final String operationExecutionHeader = requestRestHeader.get(0);
			if (LOG.isDebugEnabled()) {
				LOG.debug("Received request: " + request.getRequestURI() + "with header = " + requestRestHeader.toString());
			}
			final String[] headerArray = operationExecutionHeader.split(",");

			// Extract session id
			sessionId = headerArray[1];
			if ("null".equals(sessionId)) {
				sessionId = OperationExecutionRecord.NO_SESSION_ID;
			}

			// Extract EOI
			final String eoiStr = headerArray[2];
			eoi = -1;
			try {
				eoi = 1 + Integer.parseInt(eoiStr);
			} catch (final NumberFormatException exc) {
				LOG.warn("Invalid eoi", exc);
			}

			// Extract ESS
			final String essStr = headerArray[3];
			ess = -1;
			try {
				ess = Integer.parseInt(essStr);
			} catch (final NumberFormatException exc) {
				LOG.warn("Invalid ess", exc);
			}

			// Extract trace id
			final String traceIdStr = headerArray[0];
			if (traceIdStr != null) {
				try {
					traceId = Long.parseLong(traceIdStr);
				} catch (final NumberFormatException exc) {
					LOG.warn("Invalid trace id", exc);
				}
			} else {
				traceId = CF_REGISTRY.getUniqueTraceId();
				sessionId = SESSION_ID_ASYNC_TRACE;
				eoi = 0; // EOI of this execution
				ess = 0; // ESS of this execution
			}

			// Store thread-local values
			CF_REGISTRY.storeThreadLocalTraceId(traceId);
			CF_REGISTRY.storeThreadLocalEOI(eoi); // this execution has EOI=eoi; next execution will get eoi with incrementAndRecall
			CF_REGISTRY.storeThreadLocalESS(ess + 1); // this execution has ESS=ess
			SESSION_REGISTRY.storeThreadLocalSessionId(sessionId);
		}

		// measure before
		tin = TIME.getTime();

		threadSpecificInterceptedData.set(new ThreadSpecificInterceptedData(signature, sessionId, traceId, tin, hostname, eoi, ess));
		response.setHeader(RestInterceptorConstants.HEADER_FIELD, traceId + "," + sessionId + "," + (eoi+1) + "," + Integer.toString(CF_REGISTRY.recallThreadLocalESS()));

		return true;
	}

	@Override
	public void afterCompletion(final HttpServletRequest request, final HttpServletResponse response, final Object handler, final Exception exception) {
		// measure after
		final long tout = TIME.getTime();

		final ThreadSpecificInterceptedData tsid = threadSpecificInterceptedData.get();
		CTRLINST.newMonitoringRecord(new OperationExecutionRecord(tsid.getSignature(), tsid.getSessionId(), tsid.getTraceId(), tsid.getTin(), tout, tsid.getHostname(), tsid.getEoi(), tsid.getEss()));
		
		// cleanup
		CF_REGISTRY.unsetThreadLocalTraceId();
		CF_REGISTRY.unsetThreadLocalEOI();
		CF_REGISTRY.unsetThreadLocalESS();
	}
}
