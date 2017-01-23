package com.example.registry;

import com.example.registry.model.MicroserviceContinuousAnomalyInjection;
import com.example.registry.model.MicroserviceRampUpAnomalyInjection;
import com.example.registry.model.MicroserviceRealAnomalyInjection;
import com.example.registry.model.MicroserviceRegistrationInfo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

@SpringBootApplication
public class MicroserviceApplication {

	public static void main(String[] args) {

        Thread injectorThread = new Thread(new Injector());
        injectorThread.start();
		SpringApplication.run(MicroserviceApplication.class, args);
	}


}
