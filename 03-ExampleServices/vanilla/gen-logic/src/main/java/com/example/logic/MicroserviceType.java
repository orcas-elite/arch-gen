package com.example.logic;

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
	protected String type = "logic";
	protected String version = "1.0.0";
	protected static String uuid = java.util.UUID.randomUUID().toString();
	private int delay = 0;
	private RestTemplate restTemplate = new RestTemplate();
	
    public MicroserviceType() {
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
	
	@RequestMapping(value = "/info", method = GET)
	public String getInfo() {
	    return this.type;
	}
	
	@RequestMapping(value = "/login", method = GET)
	public ResponseEntity<String> doLogin() {
		
	restTemplate.getForObject("http://database:8080/login", String.class);
		return new ResponseEntity<String>("Operation doLogin executed successfully.", HttpStatus.OK);
	}
	@RequestMapping(value = "/order", method = GET)
	public ResponseEntity<String> doOrder() {
		
	restTemplate.getForObject("http://database:8080/order", String.class);
		return new ResponseEntity<String>("Operation doOrder executed successfully.", HttpStatus.OK);
	}
}
