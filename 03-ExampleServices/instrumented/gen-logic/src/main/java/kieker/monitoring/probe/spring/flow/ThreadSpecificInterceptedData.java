package kieker.monitoring.probe.spring.flow;

public class ThreadSpecificInterceptedData {

    private String signature;
    private String sessionId;
    private long traceId;
    private long tin;
    private String hostname;
    private int eoi;
    private int ess;

    public ThreadSpecificInterceptedData(String signature, String sessionId, long traceId, long tin, final String hostname, int eoi, int ess) {
        this.signature = signature;
        this.sessionId = sessionId;
        this.traceId = traceId;
        this.tin = tin;
        this.hostname = hostname;
        this.eoi = eoi;
        this.ess = ess;
    }

    public String getSignature() {
        return signature;
    }

    public String getSessionId() {
        return sessionId;
    }

    public long getTraceId() {
        return traceId;
    }

    public long getTin() {
        return tin;
    }

    public String getHostname() {
        return hostname;
    }

    public int getEoi() {
        return eoi;
    }

    public int getEss() {
        return ess;
    }
}
