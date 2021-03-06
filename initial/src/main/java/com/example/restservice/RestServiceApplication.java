package com.example.restservice;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestServiceApplication {

	public static void main(String[] args) {
		//Politica de seguran�a
		System.setProperty("java.security.policy", "java.policy");
		if (System.getSecurityManager() == null) {
		 System.setSecurityManager(new SecurityManager());
		}
		
		System.setProperty("java.security.policy","file:java.policy");
		
		  SpringApplication app = new SpringApplication(RestServiceApplication.class);
	        app.setDefaultProperties(Collections
	          .singletonMap("server.port", "8083"));
	        app.run(args);
	}
}
