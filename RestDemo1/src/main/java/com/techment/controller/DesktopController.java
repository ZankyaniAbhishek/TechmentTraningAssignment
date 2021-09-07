package com.techment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value =  "/Desktop")
public class DesktopController {

	@GetMapping(value = "/showMessage")
	public String Hello()
	{
		return "Welcome to desktop";
	}
	
	
}
