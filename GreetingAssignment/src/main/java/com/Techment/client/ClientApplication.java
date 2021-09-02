package com.Techment.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Techment.service.GreeterService;


public class ClientApplication {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.Techment");
		context.refresh();

		GreeterService service = (GreeterService) context.getBean("greeterService"); 
		service.printGreeting();


	}

}
