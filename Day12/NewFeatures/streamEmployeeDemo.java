package com.Techment.Day12.NewFeatures;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class streamEmployeeDemo {

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
			
			//For each using Lamda variable Printing the list
			employees.stream().forEach(i->System.out.println(i));
			
			//Count Number Of Employees Intermediate Operations
			Long count = employees.stream().count();
			System.out.println("Numbers Of Employees : " + count);
			
			Long devcount = employees.stream().filter(e->e.getDept().equalsIgnoreCase("developer")).count();
			System.out.println("Numbers Of EMployees : " + devcount);
			
			employees.stream().filter(e->e.getDept().equalsIgnoreCase("developer")).forEach(e->System.out.println("Name of the Developer is : " +e.getName()));
			List<Employee> emp =employees.stream().filter(e->e.getDept().equalsIgnoreCase("developer")).collect(Collectors.toList());
			System.out.println(emp);
			
			streamEmployeeDemo demo = new streamEmployeeDemo();
			List<Employee> employees2 = demo.filterByDept(employees, "Manager");
			System.out.println();
			System.out.println(employees2);
			//Terminal Operations
			long numberofEmployees = employees.stream().collect(Collectors.counting());
			System.out.println(numberofEmployees);
			
//			employees.stream().filter(e->e.getDept().equalsIgnoreCase("Developer")).
			Long totalsalary =employees.stream().collect(Collectors.summarizingInt(Employee::getSalary)).getSum();
			System.out.println(totalsalary);
			int maxsalary =employees.stream().collect(Collectors.summarizingInt(Employee::getSalary)).getMax();
			System.out.println(maxsalary);
	
	}

	List filterByDept(ArrayList<Employee> emplist,String dept )
	{
		List<Employee> emp =  emplist.stream().filter(e->e.getDept().equals(dept)).collect(Collectors.toList());
		return emp;
	}
}
