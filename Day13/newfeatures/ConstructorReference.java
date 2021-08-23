package com.Techment.Day13.newfeatures;

import javax.print.DocFlavor.STRING;
@FunctionalInterface
interface A
{
	Student getstudentdetails();
}
class Student
{
	int id;
	String name;
	void Display()
	{
		System.out.println("This is Student Info :");
	}
}


public class ConstructorReference {

	public static void main(String[] args) {
		
		//by using Lamda Multi Line 
		A a = ()-> {Student s = new Student();
		return s;
		};
		//by using Lamda Single Line
		A a1 = ()->new Student();
		a.getstudentdetails().Display();
		a1.getstudentdetails().Display();
		
		//by using Method Reference
		
		A obj = Student::new;
		obj.getstudentdetails().Display();

	}

}
