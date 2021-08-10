package com.Techment.Day6.ExceptionHandling;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("name is ");
		System.out.println("email is azankyani@gmail.com");
		try {
			System.out.println(1/0);	
		}
		catch(ArithmeticException ex)
		{
			System.out.println("dont give zero");
		}
		System.out.println("welcome");
		

	}

}
