package com.Techment.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //<bean id = "employee" class ="com.Techment.Employee">
public class Employee {

//	int id;
//	String name;
//	
	@Autowired
	Address address;
	
	public void displayDisplay()
	{
		address.Addressdetails();
	}
}
