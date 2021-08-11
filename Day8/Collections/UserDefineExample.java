package com.Techment.Day8.Collections;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>
{
	int id;
	String name;
	String dept;
	int age ;
	
	public Employee(int id, String name, String dept, int age) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.age = age;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if(this.age>o.age)
			return 1;
		else if(this.age== o.age)
			return 0;
		else
			return -1;
	
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", age=" + age + "]";
	}
	
	
}
public class UserDefineExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1,"rahul","hr",34));
		employees.add(new Employee(2,"ramesh","Manager",35));
		employees.add(new Employee(3,"anul","hr Manager",26));
		employees.add(new Employee(4,"manoj","developer",40));
		
		for(Employee emp: employees)
		{
			System.out.println(emp.id + " " +emp.name + " "+emp.dept + " "+ emp.age );
		}
		System.out.println("===============Sorting=================    ");
		
		Collections.sort(employees);
		
		//System.out.println(employees.toString());
		for(Employee emp: employees)
		{
			System.out.println(emp.id + " " +emp.name + " "+emp.dept + " "+ emp.age );
		}
		

	}

}
