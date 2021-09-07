package com.techment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.techment.dao.IEmployeeDao;
import com.techment.entity.Employee;
@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	IEmployeeDao dao;
	
	@Override
	public String addEmployee(Employee employee) {
		dao.save(employee);
		return "Employees Added";
	}

	@Override
	public List<Employee> viewAllEmployees() {
		
		return dao.findAll();
	}

	@Override
	public Employee viewEmployeeById(int id) {
		
		return dao.findById(id).get();
	}

}
