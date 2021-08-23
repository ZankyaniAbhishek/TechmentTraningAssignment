package com.Techment.Day13.newfeatures;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.Techment.Day12.NewFeatures.Employee;

class AgeComparator implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
			if(o1.getAge()>o2.getAge())
				return 1;
			else if(o1.getAge()==o2.getAge())
				return 0;
			else
				return -1;
	}
	
}

public class StreamSortDemo {

	public static void main(String[] args) {
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1, "Sachin", "hr", 20000, 38));
		employees.add(new Employee(2, "Kumar", "Developer", 30000, 23));
		employees.add(new Employee(3, "Anil", "Manager", 40000, 55));
		employees.add(new Employee(4, "John", "Developer", 50000, 45));
		employees.add(new Employee(5, "Rahul", "Manager", 60000, 48));
		employees.add(new Employee(6, "Saurabh", "hr", 70000, 30));
		employees.add(new Employee(7, "Jatin", "Developer", 80000, 28));
		
		employees.forEach(System.out::println);
		
		System.out.println("Sorting Based on Age");
		employees.stream().sorted(new AgeComparator()).forEach(System.out::println);
		System.out.println("=======================Using Method Sortedd By Using Sorted ComparingInt=============");
		employees.stream().sorted(Comparator.comparing(Employee::getAge)).forEach(System.out::println);
		System.out.println("======================= Descinding Using Method Sortedd By Using Sorted ComparingInt In Descending=============");
		employees.stream().sorted(Comparator.comparing(Employee::getAge).reversed()).forEach(System.out::println);
		System.out.println("=======================String Comparision Using Method Sortedd By Using Sorted ComparingInt=============");
		List<Employee> empl = employees.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
		empl.forEach(System.out::println);
		System.out.println("================================================================================================================================");
		
		//employees.stream().map(e->(e.getSalary()+e.getSalary()*0.2)).forEach(System.out::println);
		employees.stream().map(e->" Name "+e.getName()+" Salary "+e.getSalary()+" Salary Increased by 20% = "+((e.getSalary()+e.getSalary()*0.2))).forEach(System.out::println);
		//List<String> List=employees.stream().map(e->" Name "+e.getName()+" Salary "+e.getSalary()+" Salary Increased by 20% = "+((e.getSalary()+e.getSalary()*0.2))).collect(Collectors.toList()));
		//StreamSortDemo
		

	}
	List<Employee> deptWiseSalary(ArrayList<Employee> emp , String dept)
	{
		List<Employee> emplist =  emp.stream().filter(e->e.getDept().equalsIgnoreCase(dept)).collect(Collectors.toList());
		return emplist;
	}
}
