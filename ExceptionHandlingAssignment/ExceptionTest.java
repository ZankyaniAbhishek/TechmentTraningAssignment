package com.Techment.ExceptionHandlingAssignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		try
		{
			
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The 1st Number : ");
		int num1 = scanner.nextInt();
		System.out.println("Enter The 2nd Number : ");
		int num2 = scanner.nextInt();
		int result = num1/num2;
		System.out.println(result);
		scanner.close();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Only Integers Are Allowed");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Division With Zero is Not Possible");
		}

	}

}
