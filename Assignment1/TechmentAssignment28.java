package com.Techment.demo;

import java.util.Scanner;

public class TechmentAssignment28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int validpin = 12345;
		do
		{
			System.out.println("Enter the Pin : ");
			int pin = scanner.nextInt();
			if(pin==validpin)
				break;
			else
				{System.out.println("Invalid Pin Re-Enter The Pin");
				continue;}
				
		}while(true);
		System.out.println("Pin Accepted");

	}

}
