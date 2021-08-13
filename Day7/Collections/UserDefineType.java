package com.Techment.Day7.Collections;

import java.util.ArrayList;

class Employee
{
	int id;
	String Name;
	String dept;
	public Employee(int id, String name, String dept) {
		super();
		this.id = id;
		Name = name;
		this.dept = dept;
	}
	
}
public class UserDefineType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee(1, "Ashok", "hr");
		Employee emp2 = new Employee(2, "Ravi", "hrm");
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(emp);
		employees.add(emp2);
		employees.add(new Employee(3, "Raghu", "hui"));
		
employees.set(1,new Employee(101, "mahesh", "dept"));
for(Employee emp1 : employees)
{
	System.out.println(emp1.id + " " + emp1.Name + " " + emp1.dept);
}
	
	}

}
