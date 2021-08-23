package com.Techment.Day13.Assignment;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import javax.print.attribute.standard.DateTimeAtCompleted;
import javax.print.attribute.standard.DateTimeAtProcessing;

public class JavaStreamApiCaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department department1 = new Department(1001, "hr", 100);
		Department department2 = new Department(1002, "Developer", 101);
		Department department3 = new Department(1003, "Manager", 102);
		Department department4 = new Department(1004, "Technical", 103);
		
		//Local Date input in form dd/MM/YY
		List<Employee> employees = new ArrayList<Employee>();
		Employee employee1 = new Employee(1, "Rahul", "Sahu", "rahulsahu@gmail.com","8770961969", "11/11/2020", "Senior hr", 35000, 100, department1);
		Employee employee2 = new Employee(2, "Amit", "Mishra", "ramumushra@gmail.com","8770961968", "15/06/2019", "Manager hr", 25000, 101, department2);
		Employee employee3 = new Employee(3, "Sachin", "Jain", "sachinjain@gmail.com","8770961967", "18/04/2018", "Developer hr", 30000, 103, department3);
		Employee employee4 = new Employee(4, "Varun", "Dhawan", "varundhawan@gmail.com","8770961966", "21/03/2017", "Manager hr", 20000, 104, department1);
		Employee employee5 = new Employee(5, "Shahrukh", "Sikar", "shankrukh@gmail.com","8770961965", "23/08/2016", "Developer hr", 45000, 105, department2);
		Employee employee6 = new Employee(6, "Salman", "Tiwari", "salmantiwari@gmail.com","8770961964", "25/09/2015", "Senior hr", 55000, 106, department3);
		Employee employee7 = new Employee(7, "Surya", "Singham", "singham@gmail.com","125478963", "05/05/1998", "Senior hr", 55000, 0, department1);
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		employees.add(employee5);
		employees.add(employee6);
		employees.add(employee7);
		
		JavaStreamApiCaseStudy apiCaseStudy = new JavaStreamApiCaseStudy();
		apiCaseStudy.SalarySum(employees);
		apiCaseStudy.countEmployeesacctodept(employees);
		apiCaseStudy.SeniorEmployee(employees);
		apiCaseStudy.EmployeeService(employees);
		apiCaseStudy.EmployeejoiningDay(employees);
		apiCaseStudy.EmployeeSortEmployeeid(employees);
		apiCaseStudy.EmployeeSortfirstname(employees);
		apiCaseStudy.EmployeeWithoutManager(employees);
		apiCaseStudy.EmployeeSalaryhike(employees);
		
	}
	void SalarySum(List<Employee> emp)
	{
		System.out.println("===============Salary SUm Of All Employees =======");
		Long SalarySum =emp.stream().collect(Collectors.summarizingInt(Employee::getSalary)).getSum();
		System.out.println("Sum Of Salary OF All The Employees : "+SalarySum);		
	}
	void countEmployeesacctodept(List<Employee> emp)
	{
		System.out.println("===============Distinct Depts=====");
//		emp.stream().filter(e->e.getDepartment()).distinct().collect(Collectors.summarizingInt(Employee::dept)).m;
		System.out.println(emp.stream().map(e->e.getDepartment().departmentName+"  ").distinct().collect(Collectors.toList()));
		//l);
	}
	void SeniorEmployee(List<Employee> emp)
	{
		System.out.println("===============SHow Detail Of senior Most Employee====");
//		System.out.println(emp.stream().sorted(Comparator.comparing(Employee::getHiredate)).collect(Collectors.maxBy(Comparator.comparing(Employee::getHiredate))));
		System.out.println(emp.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getHiredate))));
	}
	void EmployeeService(List<Employee> emp)
	{
		//java.util.Date dated = new java.util.Date().UTC(20, 12, 11, 00, 00, 00);
		System.out.println();
		//System.out.println(emp.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getHiredate))));
		emp.stream().map(e->e.firstname +" " +e.lastname + " Service Period in Years : " +(LocalDate.now().compareTo(e.getHiredate()) )).forEach(System.out::println);
	}
	void EmployeejoiningDay(List<Employee> emp)
	{
		System.out.println("===============SHow Detail Of senior Most Employee=====");
		System.out.println(emp.stream().min(Comparator.comparing(Employee::getHiredate)));
		
		//emp.stream().filter(e->e.getHiredate().compareTo())()
		
//		System.out.println(emp.stream().sorted(Comparator.comparing(Employee::getHiredate)).collect(Collectors.maxBy(Comparator.comparing(Employee::getHiredate))));
		//emp.stream().map(e->e.getHiredate().getDay()).forEach(System.out::println);;
	}
	void EmployeeSortEmployeeid(List<Employee> emp)
	{
		System.out.println("===============Sorting Using ID=====");
		emp.stream().sorted(Comparator.comparing(Employee::getEmployeeid)).forEach(System.out::println);
	}
	void EmployeeSortManagerid(List<Employee> emp)
	{
		System.out.println("===============Sorting Using ID=====");
		//emp.stream().sorted(Comparator.comparingInt(Department::getManagerid)).forEach(System.out::println);
	}
	void EmployeeSortfirstname(List<Employee> emp)
	{
		System.out.println("===============Sorting Using First Name=====");
		emp.stream().sorted(Comparator.comparing(Employee::getFirstname)).forEach(System.out::println);
	}
	void EmployeeWithoutManager(List<Employee> emp)
	{
		System.out.println("===============Employees Without Manager=====");
		System.out.println(emp.stream().filter(e->e.getManagerid()==0).collect(Collectors.toList()));
	}
	void EmployeeSalaryhike(List<Employee> emp)
	{
		System.out.println("===============Employees Salary Hike=====");
		emp.stream().map(e->"Name : " + e.getFirstname() +" "+e.getLastname()+" Previous Salary : "+e.getSalary()+" Updated Salary : " + (e.getSalary() + e.getSalary()*0.15)).forEach(System.out::println);
	}
	
	void EmployeeToManager(List<Employee> emp)
	{
		System.out.println("===============Employees Manger Relation=====");
		emp.stream().map(e->"Employee Name : " + e.getFirstname() +" "+e.getLastname()+" Reports to: "+e.getSalary()+" Updated Salary : " + (e.getSalary() + e.getSalary()*0.15)).forEach(System.out::println);
	}
	void EmployeeMaximuminDept(List<Employee> emp)
	{
		//int max2 = secondArray.stream().max(Integer::compare).get();
		System.out.println("===============Employees Manger Relation=====");
		//emp.stream().map(e->"Employee Name : " + e.getFirstname() +" "+e.getLastname()+" Dept : "+e.getDepartment()+" Count of Employees : ").filter(Employee::getDepartment);
	}
}
