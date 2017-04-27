package com.example.logic;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import kieker.monitoring.probe.spring.flow.RestOutInterceptor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.DELETE;

public abstract class MicroserviceType {
	protected String type = "logic";
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
	
	@RequestMapping(value = "/login", method = GET)
	public ResponseEntity<String> doLogin() {
		
		Integer delay = requestDelay("doLogin");
	try {
		Thread.sleep(delay);
	} catch(InterruptedException ie) {
		System.out.println("Exception occurred while trying to inject delay of " + delay + ". (" + ie.getMessage() + ")");
	}
		
	restTemplate.getForObject("http://database:8080/login", String.class);
		return new ResponseEntity<String>("Operation doLogin executed successfully.", HttpStatus.OK);
	}
	@RequestMapping(value = "/order", method = GET)
	public ResponseEntity<String> doOrder() {
		
		Integer delay = requestDelay("doOrder");
	try {
		Thread.sleep(delay);
	} catch(InterruptedException ie) {
		System.out.println("Exception occurred while trying to inject delay of " + delay + ". (" + ie.getMessage() + ")");
	}
		
	restTemplate.getForObject("http://database:8080/order", String.class);
		return new ResponseEntity<String>("Operation doOrder executed successfully.", HttpStatus.OK);
	}
}
