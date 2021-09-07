package com.techment.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techment.entity.Employee;

@RestController
@RequestMapping(value = "/employeeController")
public class EmployeeController {

	ArrayList<Employee> employees=new ArrayList<Employee>();
	public EmployeeController()
	{
		employees.add(new Employee(1,"Sachin","hr"));
		employees.add(new Employee(2,"Rahul","delveloper"));
	}
	
	
	//public
	
	
	@GetMapping(value ="/showMessage")
	public String display()
	{
		return "this is my first demo";
	}
	
	@GetMapping(value ="/getAllEmployee")
	public ArrayList<Employee> showEmployees()
	{
		//employees = new ArrayList<Employee>();
		
		return employees;
	}
	
	@PostMapping(value = "/setEmployee")
	public String addEmployee(@RequestBody Employee employee)
	{
		//System.out.println();
		employees.add(employee);
		return "Successfull Added";
	}
	
	
}
