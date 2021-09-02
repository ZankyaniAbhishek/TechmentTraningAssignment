package com.Techment.Client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Techment.Service.Restaurant;


public class RestaurantClientApplication {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.Techment");
		context.refresh();
		
		Restaurant employee = (Restaurant) context.getBean("restaurant");
		employee.MenuRestaurantDisplay();


	}

}
