package com.Techment.Day13.Assignment;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Department
{
	int departmentid;
	String departmentName;
	int managerid;
	public Department(int departmentid, String departmentName, int managerid) {
		super();
		this.departmentid = departmentid;
		this.departmentName = departmentName;
		this.managerid = managerid;
	}
	public int getDepartmentid() {
		return departmentid;
	}
	public void setDepartmentid(int departmentid) {
		this.departmentid = departmentid;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public int getManagerid() {
		return managerid;
	}
	public void setManagerid(int managerid) {
		this.managerid = managerid;
	}
	@Override
	public String toString() {
		return "departmentid=" + departmentid + ", departmentName=" + departmentName + ", managerid="
				+ managerid + " ";
	}
	
}
public class Employee {
	//Local Date input in form dd/MM/YY
	int employeeid;
	String firstname;
	String lastname;
	String email;
	String phoneno;
	LocalDate hiredate;
	String designation;
	int salary;
	int managerid;
	Department department;
	DateTimeFormatter formatter = null;
	public Employee(int employeeid, String firstname, String lastname, String email, String phoneno, String hire,String designation, int salary, int managerid, Department department) {
		super();
		this.employeeid = employeeid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.phoneno = phoneno;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
		this.hiredate = LocalDate.parse(hire,formatter);
				//		try {
//			this.hiredate = new  SimpleDateFormat("dd/MM/yyyy").parse(hire);
//		} catch (ParseException e) {
//			
//			e.printStackTrace();
//		}  
//		formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
//		this.hiredate = LocalDate.parse(hiredate, formatter);

		//this.hiredate = hiredate;
		this.designation = designation;
		this.salary = salary;
		this.managerid = managerid;
		this.department = department;
	}
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public LocalDate getHiredate() {
		return hiredate;
	}
	public void setHiredate(LocalDate hiredate) {
		this.hiredate = hiredate;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getManagerid() {
		return managerid;
	}
	public void setManagerid(int managerid) {
		this.managerid = managerid;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public DateTimeFormatter getFormatter() {
		return formatter;
	}
	public void setFormatter(DateTimeFormatter formatter) {
		this.formatter = formatter;
	}
	@Override
	public String toString() {
		return "Eid :" + employeeid + " Name=" + firstname + " "+lastname +  ", hiredate : " + hiredate + ", Designation : " + designation
				+ ", salary : " + salary + ", Mid : " + managerid + ", department : " + department + " ";
	}
	
	
}
