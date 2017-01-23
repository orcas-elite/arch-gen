package com.example.portal;

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
	protected String type = "portal";
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
	
	@RequestMapping(value = "/", method = GET)
	public String getIndex() {
		
		Integer delay = requestDelay("getIndex");
	try {
		Thread.sleep(delay);
	} catch(InterruptedException ie) {
		System.out.println("Exception occurred while trying to inject delay of " + delay + ". (" + ie.getMessage() + ")");
	}
		
		return "Operation getIndex executed successfully.";
	}
	@RequestMapping(value = "/login", method = GET)
	public String getLogin() {
		
		Integer delay = requestDelay("getLogin");
	try {
		Thread.sleep(delay);
	} catch(InterruptedException ie) {
		System.out.println("Exception occurred while trying to inject delay of " + delay + ". (" + ie.getMessage() + ")");
	}
		
	restTemplate.getForObject("http://logic:8080/login", String.class);
	
		return "Operation getLogin executed successfully.";
	}
	@RequestMapping(value = "/order", method = GET)
	public String getOrder() {
		
		Integer delay = requestDelay("getOrder");
	try {
		Thread.sleep(delay);
	} catch(InterruptedException ie) {
		System.out.println("Exception occurred while trying to inject delay of " + delay + ". (" + ie.getMessage() + ")");
	}
		
	restTemplate.getForObject("http://logic:8080/order", String.class);
	
		return "Operation getOrder executed successfully.";
	}
}
