package com.Techment.Day4.oops;

class Student
{
	//int Studentid;
	String Name;
	String Surname;
	int Age;
	public Student(String name, String surname, int age) {
		super();
		Name = name;
		Surname = surname;
		Age = age;
	}
	
}
class Engineer extends Student
{
	String Specialization;
	int passyear;
	String College;
	public Engineer(String name, String surname, int age, String specialization, int passyear, String college) {
		super(name, surname, age);
		Specialization = specialization;
		this.passyear = passyear;
		College = college;
	}
	
	}
	

class JobPerson extends Engineer
{
	
	int salary;
	String joiningdate;
	String Position;
	public JobPerson(String name, String surname, int age, String specialization, int passyear, String college,
			int salary, String joiningdate, String position) {
		super(name, surname, age, specialization, passyear, college);
		this.salary = salary;
		this.joiningdate = joiningdate;
		Position = position;
		
		System.out.println("Full Name is : "+name + " "+surname);
		System.out.println("Age is : "+age);
		System.out.println("Specialisation : " + specialization);
		System.out.println("Pass Year : "+ passyear);
		System.out.println("College : "+college);
		System.out.println("Salary : "+salary);
		System.out.println("JOining Date : " + joiningdate);
		System.out.println("Position : "+position);
		
	}
	}
	


public class MiltiLevelInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JobPerson jobPerson = new JobPerson("Abhishek","Zankyani",23,"Computer Science",2020,"Shri SHankaracharaya Engineering", 10000,"August","Developer");
		

	}

}
