package com.Techment.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Techment.model.Employee;

public class ClientApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.Techment");
		context.refresh();
		
		Employee employee = (Employee) context.getBean("employee");
		employee.displayDisplay();

	}

}
