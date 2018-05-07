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

class EnvironmentGeneratorVanilla {

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
			createPomFile(projectDir, mst, ms);
			createDockerfile(projectDir, mst.identifier + "-" + ms.version.versionString);
			createKubernetesFile(projectDir, mst, ms);
			createMicroserviceBaseInfoFile(projectDir, mst);
		}
	}

	def createPomFile(File dir, MicroserviceType mst, Microservice ms) {
		val file = new File(dir.path + "/pom.xml");
		writeToFile(file, genPomContent(mst, ms).toString());
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
	
	def createKubernetesFile(File dir, MicroserviceType mst, Microservice ms) {
		val file = new File(dir.path + "/kubernetes.yaml");
		writeToFile(file, genKubernetesFile(mst, ms).toString());
	}
	
	def createMicroserviceBaseInfoFile(File dir, MicroserviceType mst) {
		val file = new File(dir.path + "/src/main/java/com/example/" + mst.identifier + "/MicroserviceBaseInfo.java");
		writeToFile(file, genMicroserviceBaseInfoContent(mst).toString());
	}
	
	def File createProjectStructure(String projectName) {
		val projectDir = new File(basePath.path + "/gen-" + projectName);
		new File(projectDir.path + "/src/main/java/com/example/" + projectName).mkdirs();
		new File(projectDir.path + "/src/main/resources/META-INF").mkdirs();
		return projectDir;
	}

	def genMicroserviceTypeContent(MicroserviceType mst, Microservice ms) '''
		package com.example.«ms.microserviceType.identifier»;
		
		import java.lang.annotation.Annotation;
		import java.lang.reflect.Method;
		import java.util.ArrayList;
		import java.util.Collections;
		import java.util.List;
		
		import org.springframework.http.HttpStatus;
		import org.springframework.http.ResponseEntity;
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
			private RestTemplate restTemplate = new RestTemplate();

			@RequestMapping(value = "/info", method = GET)
			public String getInfo() {
			    return this.type;
			}
			
			«FOR operation : mst.restOperations»
				@RequestMapping(value = "«operation.subPath»", method = «operation.restVerb.toString»)
				public ResponseEntity<String> «operation.name»() {
					
				«FOR OperationToOperationCallingDependency otocd : mst.dependencies»
					«IF otocd.callingOperation.name == operation.name»
						«IF otocd.callingVersion == ms.version»					
							restTemplate.getForObject("http://«otocd.calledMicroservice.identifier»:8080«otocd.calledOperation.subPath»", String.class);
						«ENDIF»
					«ENDIF»
				«ENDFOR»
					return new ResponseEntity<String>("Operation «operation.name» executed successfully.", HttpStatus.OK);
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
		
		import org.springframework.boot.SpringApplication;
		import org.springframework.boot.autoconfigure.SpringBootApplication;
		import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
		
		@SpringBootApplication
		public class MicroserviceApplication extends WebMvcConfigurerAdapter {
		
			public static void main(String[] args) {
				SpringApplication.run(MicroserviceApplication.class, args);
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
				    <groupId>org.springframework.boot</groupId>
				    <artifactId>spring-boot-starter-aop</artifactId>
				</dependency>
				
				<dependency>
				    <groupId>org.springframework.boot</groupId>
				    <artifactId>spring-boot-starter-activemq</artifactId>
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
	
	def genKubernetesFile(MicroserviceType mst, Microservice ms) '''
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
	---
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
	
	def writeToFile(File file, String s) {
		val writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "utf-8"));
		writer.write(s);
		writer.flush();
	}
}
