package com.Techment.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MorningGreeting implements IGreeting {

	String greeting = "Good Morning";
	
	
	public String greet() {
		
		return greeting ;
	}

	public MorningGreeting() {
		
	}

	public MorningGreeting(String greeting) {
		super();
		this.greeting = greeting;
	}


	public String getGreeting() {
		return greeting;
	}


	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

}
