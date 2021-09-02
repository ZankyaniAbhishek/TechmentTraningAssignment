package com.Techment.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Techment.service.DataBaseService;

public class ClientApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext();
		context.scan("com.Techment");
		context.refresh();
		
	DataBaseService baseService=	(DataBaseService) context.getBean("dataBaseService");
	//DataBaseService baseService=	(DataBaseService) context.getBean("dbservice");
		baseService.displayDatabaseInfo();
	}

}
