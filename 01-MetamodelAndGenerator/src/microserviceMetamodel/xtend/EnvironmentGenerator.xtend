package microserviceMetamodel.xtend

import microserviceMetamodel.Endpoint
import microserviceMetamodel.MetaModelStructure
import microserviceMetamodel.Microservice
import microserviceMetamodel.MicroserviceType
import microserviceMetamodel.OperationToOperationCallingDependency
import java.io.BufferedWriter
import java.io.File
import java.io.FileOutputStream
import java.io.OutputStreamWriter

class EnvironmentGenerator {

	private File basePath;
	private MetaModelStructure mms;
	private int configurationId;

	new(File basePath, MetaModelStructure mms) {
		this.basePath = basePath;
		this.mms = mms;
		this.configurationId = 0;

		createProjects()
	}

	new(File basePath, MetaModelStructure mms, int configurationId) {
		this.basePath = basePath;
		this.mms = mms;
		this.configurationId = configurationId;

		createProjects();
	}

	def void createProjects() {
		for (Microservice ms : this.mms.configurations.get(configurationId).microservices) {
			val mst = ms.microserviceType;
			val projectDir = createProjectStructure(mst.identifier);
			createMicroserviceTypeFile(projectDir, mst, ms);
			createMicroserviceFile(projectDir, mst, ms);
			createSpringbootInitFile(projectDir, mst);
			createOutInterceptorFile(projectDir);
			createInInterceptorFile(projectDir);
			createRestInterceptorConstantsFile(projectDir);
			createThreadSpecificInterceptedDataFile(projectDir);
			createPomFile(projectDir, mst, ms);
			createAopSettingsFile(projectDir);
			createDockerfile(projectDir, mst.identifier + "-" + ms.version.versionString);
			createKubernetesService(projectDir, mst, ms);
			createKubernetesController(projectDir, mst, ms);
			createKiekerMonitoringPropertiesFile(projectDir);
			createMicroserviceBaseInfoFile(projectDir, mst);
			createMicroserviceRegistrationInfoFile(projectDir, mst);
		}
	}

	def createPomFile(File dir, MicroserviceType mst, Microservice ms) {
		val file = new File(dir.path + "/pom.xml");
		writeToFile(file, genPomContent(mst, ms).toString());
	}

	def createAopSettingsFile(File dir) {
		val file = new File(dir.path + "/src/main/resources/aop-settings.xml");
		writeToFile(file, genAopSettingsContent().toString());
	}

	def createDockerfile(File dir, String nameVersion) {
		val file = new File(dir.path + "/Dockerfile");
		writeToFile(file, genDockerfile(nameVersion).toString());
	}

	def createSpringbootInitFile(File dir, MicroserviceType mst) {
		val file = new File(dir.path + "/src/main/java/com/example/" + mst.identifier + "/MicroserviceApplication.java");
		writeToFile(file, genMicroserviceApplicationContent(mst).toString());
	}

	def createMicroserviceTypeFile(File dir, MicroserviceType mst, Microservice ms) {
		val file = new File(dir.path + "/src/main/java/com/example/" + mst.identifier + "/MicroserviceType.java");
		writeToFile(file, genMicroserviceTypeContent(mst, ms).toString());
	}

	def createMicroserviceFile(File dir, MicroserviceType mst, Microservice ms) {
		val file = new File(dir.path + "/src/main/java/com/example/" + mst.identifier + "/Microservice.java");
		writeToFile(file, genMicroserviceContent(mst, ms).toString());
	}
	
	def createKubernetesService(File dir, MicroserviceType mst, Microservice ms) {
		val file = new File(dir.path + "/kubernetes/service.yaml");
		writeToFile(file, genKubernetesServiceFile(mst, ms).toString());
	}
	
	def createKubernetesController(File dir, MicroserviceType mst, Microservice ms) {
		val file = new File(dir.path + "/kubernetes/controller.yaml");
		writeToFile(file, genKubernetesControllerFile(mst, ms).toString());
	}

	def createOutInterceptorFile(File dir) {
		val file = new File(dir.path + "/src/main/java/kieker/monitoring/probe/spring/flow/RestOutInterceptor.java");
		writeToFile(file, genOutInterceptor().toString());
	}
	
	def createInInterceptorFile(File dir) {
		val file = new File(dir.path + "/src/main/java/kieker/monitoring/probe/spring/flow/RestInInterceptor.java");
		writeToFile(file, genInInterceptor().toString());
	}

	def createRestInterceptorConstantsFile(File dir) {
		val file = new File(dir.path + "/src/main/java/kieker/monitoring/probe/spring/flow/RestInterceptorConstants.java");
		writeToFile(file, genRestInterceptorConstants().toString());
	}
	
	def createThreadSpecificInterceptedDataFile(File dir) {
		val file = new File(dir.path + "/src/main/java/kieker/monitoring/probe/spring/flow/ThreadSpecificInterceptedData.java");
		writeToFile(file, genThreadSpecificInterceptedDataContent().toString());
	}
	
	def createMicroserviceBaseInfoFile(File dir, MicroserviceType mst) {
		val file = new File(dir.path + "/src/main/java/com/example/" + mst.identifier + "/MicroserviceBaseInfo.java");
		writeToFile(file, genMicroserviceBaseInfoContent(mst).toString());
	}
	
	def createMicroserviceRegistrationInfoFile(File dir, MicroserviceType mst) {
		val file = new File(dir.path + "/src/main/java/com/example/" + mst.identifier + "/MicroserviceRegistrationInfo.java");
		writeToFile(file, genMicroserviceRegistrationInfoContent(mst).toString());
	}
	
	def createKiekerMonitoringPropertiesFile(File dir) {
		val file = new File(dir.path + "/src/main/resources/META-INF/kieker.monitoring.properties");
		writeToFile(file, genKiekerMonitoringPropertiesFile().toString());
	}

	def File createProjectStructure(String projectName) {
		val projectDir = new File(basePath.path + "/gen-" + projectName);
		new File(projectDir.path + "/src/main/java/com/example/" + projectName).mkdirs();
		new File(projectDir.path + "/src/main/java/kieker/monitoring/probe/spring/flow").mkdirs();
		new File(projectDir.path + "/src/main/resources/META-INF").mkdirs();
		new File(projectDir.path + "/kubernetes").mkdir();
		return projectDir;
	}

	def genMicroserviceTypeContent(MicroserviceType mst, Microservice ms) '''
		package com.example.«ms.microserviceType.identifier»;
		
		import java.lang.annotation.Annotation;
		import java.lang.reflect.Method;
		import java.util.ArrayList;
		import java.util.Collections;
		import java.util.HashMap;
		import java.util.List;
		import java.util.Map;
		
		import kieker.monitoring.probe.spring.flow.RestOutInterceptor;
		import org.springframework.web.bind.annotation.RequestMapping;
		import org.springframework.web.client.RestTemplate;
		
		import static org.springframework.web.bind.annotation.RequestMethod.GET;
		import static org.springframework.web.bind.annotation.RequestMethod.PUT;
		import static org.springframework.web.bind.annotation.RequestMethod.POST;
		import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
		
		public abstract class MicroserviceType {
			protected String type = "«ms.microserviceType.identifier»";
			protected String version = "1.0.0";
			protected static String uuid = java.util.UUID.randomUUID().toString();
			private int delay = 0;
			private RestTemplate restTemplate = new RestTemplate();
			
		    public MicroserviceType() {
		        restTemplate.setInterceptors(Collections.singletonList(new RestOutInterceptor()));
		        this.register();
		    }
			
			protected List<String> getRegistrationMethods() {
				List<String> methodList = new ArrayList<>();
		        for(Method m : this.getClass().getMethods()) {
		            Annotation[] annotations = m.getDeclaredAnnotations();
		            for(Annotation a : annotations) {
		                if(a.annotationType() == RequestMapping.class) {
		                    methodList.add(m.getName());
		                }
		            }
		        }
		        return methodList;
			}
			
			private void register() {
				System.out.println("Registering the service..");
			    List<String> methods = this.getRegistrationMethods();
			    MicroserviceRegistrationInfo microserviceRegistrationInfo = new MicroserviceRegistrationInfo(this.type, this.uuid, methods);
			    new RestTemplate().postForObject("http://registry:8080/register", microserviceRegistrationInfo, Object.class);
			    System.out.print("done.");
			}
			
			@RequestMapping(value = "/info", method = GET)
			public String getInfo() {
			    return this.type;
			}
			
		    protected Integer requestDelay(String method) {
		        Integer result = 0;
		        RestTemplate rt = new RestTemplate();
		        
		        Integer tempResult = rt.getForObject("http://registry:8080/delay?type=" + this.type + "&uuid=" + this.uuid + "&method=" + method, Integer.class);
		        if(null != tempResult)
		        {
		        	result = tempResult;
		        }
		        
		        return result;
		    }
			
			«FOR operation : mst.restOperations»
				@RequestMapping(value = "«operation.subPath»", method = «operation.restVerb.toString»)
				public String «operation.name»() {
					
					Integer delay = requestDelay("«operation.name»");
				try {
					Thread.sleep(delay);
				} catch(InterruptedException ie) {
					System.out.println("Exception occurred while trying to inject delay of " + delay + ". (" + ie.getMessage() + ")");
				}
					
				«FOR OperationToOperationCallingDependency otocd : mst.dependencies»
					«IF otocd.callingOperation.name == operation.name»
						«IF otocd.callingVersion == ms.version»					
							restTemplate.getForObject("http://«otocd.calledMicroservice.identifier»:8080«otocd.calledOperation.subPath»", String.class);
							
						«ENDIF»
					«ENDIF»
				«ENDFOR»
					return "Operation «operation.name» executed successfully.";
				}
			«ENDFOR»
		}
	'''

	def genMicroserviceContent(MicroserviceType mst, Microservice ms) '''
		package com.example.«mst.identifier»;
		

		import java.util.List;
		
		import org.springframework.web.bind.annotation.RestController;
		
		@RestController
		public class Microservice extends MicroserviceType {
		
		    @Override
		    public String getInfo() {
		        String type = super.getInfo();
		        return type + ":" + version + ":" + uuid.toString();
		    }
		}
	'''

	def genMicroserviceApplicationContent(MicroserviceType mst) '''
		package com.example.«mst.identifier»;
		
		import java.util.concurrent.TimeUnit;
		
		import kieker.monitoring.core.controller.IMonitoringController;
		import kieker.monitoring.core.controller.MonitoringController;
		import kieker.monitoring.probe.spring.flow.RestInInterceptor;
		import org.springframework.boot.SpringApplication;
		import org.springframework.boot.autoconfigure.SpringBootApplication;
		import org.springframework.context.annotation.ImportResource;
		import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
		import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
		
		@SpringBootApplication
		@ImportResource("classpath:aop-settings.xml")
		public class MicroserviceApplication extends WebMvcConfigurerAdapter {
		
			public static void main(String[] args) {
				SpringApplication.run(MicroserviceApplication.class, args);
			}
			
			@Override
			public void addInterceptors(final InterceptorRegistry registry) {
				registry.addInterceptor(new RestInInterceptor());
			}
		}
	'''
	
	def genMicroserviceBaseInfoContent(MicroserviceType mst) '''
		package com.example.«mst.identifier»;

		public class MicroserviceBaseInfo {
		
		    protected String type;
		    protected String uuid;
		
		    public MicroserviceBaseInfo() {
		
		    }
		
		    public MicroserviceBaseInfo(String type, String uuid) {
		        this.type = type;
		        this.uuid = uuid;
		    }
		
		    public String getType() {
		        return type;
		    }
		
		    public void setType(String type) {
		        this.type = type;
		    }
		
		    public String getUuid() { return this.uuid;}
		
		    public void setUuid(String uuid) { this.uuid = uuid; }
		}
	'''
	
	def genMicroserviceRegistrationInfoContent(MicroserviceType mst) '''
		package com.example.«mst.identifier»;
		
		import java.util.ArrayList;
		import java.util.List;
		
		public class MicroserviceRegistrationInfo extends MicroserviceBaseInfo{
		
		    private List<String> methods;
		
		    public MicroserviceRegistrationInfo()
		    {}
		
		    public MicroserviceRegistrationInfo(String type, String uuid, List<String> methods) {
		        super(type,uuid);
		        this.methods = methods;
		    }
		
		    public List<String> getMethods() {
		        return methods;
		    }
		
		    public void setMethods(List<String> methodList) {
		        this.methods = methodList;
		    }
		
		
		    public List<String> toKeys() {
		        List<String> result = new ArrayList<>();
		        for(String method : methods) {
		            result.add(this.type + ":" + this.uuid + ":" + method);
		        }
		        return result;
		    }
		}
	'''
	
	def genPomContent(MicroserviceType mst, Microservice ms) '''
		<?xml version="1.0" encoding="UTF-8"?>
		<project xmlns="http://maven.apache.org/POM/4.0.0"
		         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0
		http://maven.apache.org/xsd/maven-4.0.0.xsd">
		    <modelVersion>4.0.0</modelVersion>
		
		    <groupId>com.example.«mst.identifier»</groupId>
		    <artifactId>«mst.identifier»</artifactId>
		    <version>«ms.version.versionString»</version>
		    <packaging>jar</packaging>
		
		    <name>«mst.identifier»</name>
		    <description></description>
		
		    <parent>
		        <groupId>org.springframework.boot</groupId>
		        <artifactId>spring-boot-starter-parent</artifactId>
		        <version>1.4.0.RELEASE</version>
		        <relativePath/> <!-- lookup parent from repository -->
		    </parent>
		
		    <properties>
		        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
		        <project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
		        <java.version>1.8</java.version>
		    </properties>
		    
		    <repositories>
		    	<repository>
			          <id>sonatype.oss.snapshots</id>
			          <url>https://oss.sonatype.org/content/repositories/snapshots/</url>
		        </repository>
		        
		        <repository>
		              <id>central</id>
		              <url>https://repo1.maven.org/maven2</url>
		        </repository>
		        
		        <repository>
		        	  <id>redhatga</id>
		        	  <url>https://maven.repository.redhat.com/ga/</url>
		        </repository>
		    </repositories>
		    
		    <dependencies>
		        <dependency>
		            <groupId>org.springframework.boot</groupId>
		            <artifactId>spring-boot-starter-web</artifactId>
		        </dependency>
		        
		        <dependency>
		        	<groupId>net.kieker-monitoring</groupId>
		        	<artifactId>kieker</artifactId>
		        	<version>1.13-SNAPSHOT</version>
		        </dependency>
				
				<dependency>
				    <groupId>org.springframework.boot</groupId>
				    <artifactId>spring-boot-starter-aop</artifactId>
				</dependency>
				
				<dependency>
				    <groupId>org.springframework.boot</groupId>
				    <artifactId>spring-boot-starter-activemq</artifactId>
				</dependency>
				
				<dependency>
				    <groupId>org.hyperic</groupId>
				    <artifactId>sigar</artifactId>
				    <version>1.6.5.132-6</version>
				</dependency>
				
		    </dependencies>
		    
		    <build>
		        <plugins>
		            <plugin>
		                <groupId>org.springframework.boot</groupId>
		                <artifactId>spring-boot-maven-plugin</artifactId>
		            </plugin>
		        </plugins>
		    </build>
		</project>
	'''

	def genDockerfile(String nameVersion) '''
		FROM java:openjdk-8
		
		EXPOSE 8080
		
		COPY target/«nameVersion».jar /
		
		CMD java -Dorg.apache.activemq.SERIALIZABLE_PACKAGES=* -jar «nameVersion».jar
	'''
	
	//      
	def genKubernetesServiceFile(MicroserviceType mst, Microservice ms) '''
	apiVersion: v1
	kind: Service
	metadata:
	  name: «mst.identifier»
	  labels:
	    name: «mst.identifier»
	spec:
	  type: NodePort
	  ports:
	  «FOR Endpoint ep : ms.endpoints»
	    - port: «ep.port»
	      name: «ep.protocol.toLowerCase»
	  «ENDFOR»
	  selector: 
	    name: «mst.identifier»
	'''
	
	def genKubernetesControllerFile(MicroserviceType mst, Microservice ms) '''
	apiVersion: v1
	kind: ReplicationController
	metadata:
	  name: «mst.identifier»
	  labels:
	    name: «mst.identifier»
	spec:
	  replicas: 1
	  selector:
	    name: «mst.identifier»
	  template:
	    metadata:
	      labels:
	        name: «mst.identifier»
	    spec:
	      containers:
	      - name: «mst.identifier»
	        image: my/«mst.identifier»
	        imagePullPolicy: IfNotPresent
	        ports:
	        «FOR Endpoint ep : ms.endpoints»
	        - containerPort: «ep.port»
	        «ENDFOR»
	'''

	def genKiekerMonitoringPropertiesFile() '''
	kieker.monitoring.writer=kieker.monitoring.writer.jms.JmsWriter
	kieker.monitoring.writer.jms.JmsWriter.ProviderUrl=tcp://jmsserver:61616
	kieker.monitoring.writer.jms.JmsWriter.Topic=kieker
	kieker.monitoring.writer.jms.JmsWriter.ContextFactoryType=org.apache.activemq.jndi.ActiveMQInitialContextFactory
	kieker.monitoring.writer.jms.JmsWriter.FactoryLookupName=ConnectionFactory
	'''

	def writeToFile(File file, String s) {
		val writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "utf-8"));
		writer.write(s);
		writer.flush();
	}
	
	def genOutInterceptor() '''
	package kieker.monitoring.probe.spring.flow;
	
	import java.io.IOException;
	import java.util.List;
	
	import org.springframework.http.HttpHeaders;
	import org.springframework.http.HttpRequest;
	import org.springframework.http.client.ClientHttpRequestExecution;
	import org.springframework.http.client.ClientHttpRequestInterceptor;
	import org.springframework.http.client.ClientHttpResponse;
	
	import kieker.common.logging.Log;
	import kieker.common.logging.LogFactory;
	import kieker.common.record.controlflow.OperationExecutionRecord;
	import kieker.monitoring.core.controller.IMonitoringController;
	import kieker.monitoring.core.controller.MonitoringController;
	import kieker.monitoring.core.registry.ControlFlowRegistry;
	import kieker.monitoring.core.registry.SessionRegistry;
	import kieker.monitoring.timer.ITimeSource;
	
	public class RestOutInterceptor implements ClientHttpRequestInterceptor {
	
		private static final Log LOG = LogFactory.getLog(RestOutInterceptor.class);
	
		private static final IMonitoringController CTRLINST = MonitoringController.getInstance();
		private static final ITimeSource TIME = CTRLINST.getTimeSource();
		private static final String VMNAME = CTRLINST.getHostname();
		private static final ControlFlowRegistry CF_REGISTRY = ControlFlowRegistry.INSTANCE;
		private static final SessionRegistry SESSION_REGISTRY = SessionRegistry.INSTANCE;
	
		public static final String SIGNATURE = "public void com.example.intercept.out.RestOutInterceptor.interceptOutgoingRequest()";
	
		@Override
		public ClientHttpResponse intercept(final HttpRequest request, final byte[] body, final ClientHttpRequestExecution execution) throws IOException {
	
			if (!CTRLINST.isMonitoringEnabled()) {
				return execution.execute(request, body);
			}
			boolean entrypoint = true;
			final String hostname = VMNAME;
			final String sessionId = SESSION_REGISTRY.recallThreadLocalSessionId();
			final int eoi; // this is executionOrderIndex-th execution in this trace
			final int ess; // this is the height in the dynamic call tree of this execution
			final int nextESS;
			long traceId = CF_REGISTRY.recallThreadLocalTraceId(); // traceId, -1 if entry point
			if (traceId == -1) {
				entrypoint = true;
				traceId = CF_REGISTRY.getAndStoreUniqueThreadLocalTraceId();
				CF_REGISTRY.storeThreadLocalEOI(0);
				CF_REGISTRY.storeThreadLocalESS(1); // next operation is ess + 1
				eoi = 0;
				ess = 0;
				nextESS = 1;
			} else {
				entrypoint = false;
				eoi = CF_REGISTRY.incrementAndRecallThreadLocalEOI();
				ess = CF_REGISTRY.recallAndIncrementThreadLocalESS();
				nextESS = ess + 1;
				if ((eoi == -1) || (ess == -1)) {
					LOG.error("eoi and/or ess have invalid values:" + " eoi == " + eoi + " ess == " + ess);
					CTRLINST.terminateMonitoring();
				}
			}
	
			// Get request header
			final HttpHeaders headers = request.getHeaders();
	
			headers.add("KiekerTracingInfo", Long.toString(traceId) + "," + sessionId + "," + Integer.toString(eoi) + "," + Integer.toString(nextESS));
	
			if (LOG.isDebugEnabled()) {
				LOG.debug("Sending request to " + request.getURI().toString() + " with header = " + headers.toString());
			}
	
			// measure before
			final long tin = TIME.getTime();
			// execution of the called method
			Object retval = null;
			try {
				retval = execution.execute(request, body);
			} finally {
				// measure after
				final long tout = TIME.getTime();
	
				// Process response
				if (retval instanceof ClientHttpResponse) {
					final ClientHttpResponse response = (ClientHttpResponse) retval;
					final HttpHeaders responseHeaders = response.getHeaders();
					if (responseHeaders != null) {
						final List<String> responseHeaderList = responseHeaders.get("KiekerTracingInfo");
	
						if (responseHeaderList != null) {
							if (LOG.isDebugEnabled()) {
								LOG.debug("Received response from " + responseHeaders.getLocation().toString() + " with header = " + responseHeaders.toString());
							}
							final String[] responseHeaderArray = responseHeaderList.get(0).split(",");
	
							// Extract trace id
							final String retTraceIdStr = responseHeaderArray[0];
							Long retTraceId = -1L;
							if (!"null".equals(retTraceIdStr)) {
								try {
									retTraceId = Long.parseLong(retTraceIdStr);
								} catch (final NumberFormatException exc) {
									LOG.warn("Invalid tradeId");
								}
							}
							if (traceId != retTraceId) {
								LOG.error("TraceId in response header (" + retTraceId + ") is different from that in request header (" + traceId + ")");
							}
	
							// Extract session id
							String retSessionId = responseHeaderArray[1];
							if ("null".equals(retSessionId)) {
								retSessionId = OperationExecutionRecord.NO_SESSION_ID;
							}
	
							// Extract eoi
							int retEOI = -1;
							final String retEOIStr = responseHeaderArray[2];
							if (!"null".equals(retEOIStr)) {
								try {
									retEOI = Integer.parseInt(retEOIStr);
									CF_REGISTRY.storeThreadLocalEOI(retEOI);
								} catch (final NumberFormatException exc) {
									LOG.warn("Invalid eoi", exc);
								}
							}
	
						} else {
							if (LOG.isDebugEnabled()) {
								LOG.debug("No monitoring data found in the response header from " + responseHeaders.getLocation().toString() + ". Is it instrumented?");
							}
						}
					} else {
						if (LOG.isDebugEnabled()) {
							LOG.debug("Response header from " + response.getHeaders().getLocation().toString() + " is null. Is it instrumented?");
						}
					}
					response.close();
				}
	
				CTRLINST.newMonitoringRecord(new OperationExecutionRecord(RestOutInterceptor.SIGNATURE, sessionId, traceId, tin, tout, hostname, eoi, ess));
				// cleanup
				if (entrypoint) {
					CF_REGISTRY.unsetThreadLocalTraceId();
					CF_REGISTRY.unsetThreadLocalEOI();
					CF_REGISTRY.unsetThreadLocalESS();
					SESSION_REGISTRY.unsetThreadLocalSessionId();
				} else {
					CF_REGISTRY.storeThreadLocalESS(ess); // next operation is ess
				}
			}
			return (ClientHttpResponse) retval;
		}
	}
	'''
	
	def genInInterceptor() '''
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
	'''

	def genRestInterceptorConstants() '''
	package kieker.monitoring.probe.spring.flow;
	
	public class RestInterceptorConstants {
		public static final String HEADER_FIELD = "KiekerTracingInfo";
	}
	'''
	
	def genThreadSpecificInterceptedDataContent() '''
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
	'''
	
	
	def genAopSettingsContent() '''
	<?xml version="1.0" encoding="UTF-8"?>
	<beans xmlns="http://www.springframework.org/schema/beans"
	       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	       xmlns:aop="http://www.springframework.org/schema/aop"
	       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
	                           http://www.springframework.org/schema/aop   http://www.springframework.org/schema/aop/spring-aop.xsd">
	    <bean id="opEMII" class="kieker.monitoring.probe.spring.executions.OperationExecutionMethodInvocationInterceptor" />
	    <aop:config>
	        <aop:advisor advice-ref="opEMII" pointcut="execution(public * com.example..*.*(..))"/>
	    </aop:config>
	</beans>
	'''
}
