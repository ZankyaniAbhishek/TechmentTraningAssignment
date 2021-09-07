package com.techment.service;
import java.util.List;
import com.techment.entity.Employee;

public interface IEmployeeService {

	public String addEmployee(Employee employee);
	public List<Employee> viewAllEmployees();
	public Employee viewEmployeeById(int id);
}
