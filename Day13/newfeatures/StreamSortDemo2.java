package com.Techment.Day13.newfeatures;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.Techment.Day12.NewFeatures.Employee;

public class StreamSortDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1, "Sachin", "hr", 20000, 38));
		employees.add(new Employee(2, "Kumar", "Developer", 30000, 23));
		employees.add(new Employee(3, "Anil", "Manager", 40000, 55));
		employees.add(new Employee(4, "John", "Developer", 50000, 45));
		employees.add(new Employee(5, "Rahul", "Manager", 60000, 48));
		employees.add(new Employee(6, "Saurabh", "hr", 70000, 30));
		employees.add(new Employee(7, "Jatin", "Developer", 80000, 28));
		
		StreamSortDemo2 demo2 = new StreamSortDemo2();
		System.out.println("Department Wise Salary and  Name ");
		demo2.DeptWiseSalary(employees);
		System.out.println();
		demo2.MaxSalary(employees);
		System.out.println();
		demo2.MinSalary(employees);
		System.out.println();
		demo2.DeptWiseSalary(employees, "developer");
		
		
	}

	void DeptWiseSalary(List<Employee> emp)
	{
		emp.stream().sorted(Comparator.comparing(Employee::getDept)).map(e->"Name : "+e.getName()+" Dept : "+e.getDept()+" Salary : "+e.getSalary()).forEach(System.out::println);
	}
	
	void MaxSalary(List<Employee> emp)
	{
		Double Max = (double) emp.stream().collect(Collectors.summarizingInt(Employee::getSalary)).getMax();
		System.out.println(Max);
	}
	void MinSalary(List<Employee> emp)
	{
		Double Max = (double) emp.stream().collect(Collectors.summarizingInt(Employee::getSalary)).getMin();
		System.out.println(Max);
	}
	void DeptWiseSalary(List<Employee> emp,String dept)
	{
		//emp.stream().filter(e->e.getDept().compareToIgnoreCase(dept)).collect(Collectors.summarizingInt(Employee::getSalary));
		//.map(e->"Name : "+e.getName()+" Dept : "+e.getDept()+" Salary : "+e.getSalary()).forEach(System.out::println);
		List<Employee> emplist =  emp.stream().filter(e->e.getDept().equalsIgnoreCase(dept)).collect(Collectors.toList());
		emplist.forEach(System.out::println);
	}
}
