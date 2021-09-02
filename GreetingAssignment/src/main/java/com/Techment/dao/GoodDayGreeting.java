package com.Techment.dao;

import org.springframework.stereotype.Repository;

@Repository
public class GoodDayGreeting implements IGreeting {

	String greeting ="Have a Good Day";
	public String greet() {
		
		return greeting;
	}
	public String getGreeting() {
		return greeting;
	}
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	public GoodDayGreeting(String greeting) {
		super();
		this.greeting = greeting;
	}
	
	
	public GoodDayGreeting() {
		//Default Constructor
	}
//	public void Display()
//	{
//		
//	}
//	

	
}
