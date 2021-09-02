package com.Techment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.Techment.dao.IGreeting;

@Service
public class GreeterService {

	@Autowired
	@Qualifier("goodDayGreeting")
	//@Qualifier("morningGreeting")
	IGreeting greeting;
	
	public void printGreeting() {
		System.out.println(greeting.greet());
	}
	
}
