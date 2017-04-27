package com.example.portal;

import kieker.monitoring.probe.spring.flow.RestInFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@ImportResource("classpath:aop-settings.xml")
public class MicroserviceApplication extends WebMvcConfigurerAdapter {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceApplication.class, args);
	}

	@Bean
    public FilterRegistrationBean inRequestFilter() {
        final FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new RestInFilter());
        return registration;
    }
}
