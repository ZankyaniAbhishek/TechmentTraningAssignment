package com.Techment.Day6.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exampledtodso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		try
		{
			System.out.println("Enter the First number : ");
			int num1= scanner.nextInt();
			System.out.println("Enter the Second number : ");
			int num2 = scanner.nextInt();
			int output = (int)(num1/num2);
			System.out.println("The Output Is : "+ output);
			
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Please Do not Give Zero ");
		}
		catch(InputMismatchException ex)
		{
			System.out.println("Please Do Not Give Character Enter Only Number ");
		}
	}

}
