package com.personal.stock.application;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@ComponentScan("com.personal.stock.controller")
@SpringBootApplication
public class PersonalStockApplication {
	
	private static final org.slf4j.Logger log = LoggerFactory.getLogger(PersonalStockApplication.class);

	public static void main(String[] args) {
		
		log.info("##################Starting personal stock Api#####################");
		
		SpringApplication.run(PersonalStockApplication.class, args);

	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

}
