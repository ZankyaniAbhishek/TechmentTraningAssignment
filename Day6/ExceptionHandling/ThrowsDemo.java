package com.Techment.Day6.ExceptionHandling;

import java.io.FileNotFoundException;

class Student
{
	void checkElegibility(int age) throws FileNotFoundException
	{
		if(age>=18)
			System.out.println("you can Apply for loan");
		else
			throw new FileNotFoundException("You can't Apply for loan");
//			throw new ArithmeticException("you cannot Apply For loan");
	}
}
public class ThrowsDemo {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.checkElegibility(5);

	}

}
