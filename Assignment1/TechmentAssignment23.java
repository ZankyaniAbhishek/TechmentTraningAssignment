package com.Techment.demo;

import java.util.Scanner;

public class TechmentAssignment23 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Weight : ");
		float Weight =scanner.nextFloat();

		System.out.println("Enter The Height(in meter) : ");
		float Height =scanner.nextFloat();
		
		float BMI=(Weight/(Height*Height));
		 if(BMI<18.5)
			 System.out.println("Your Category is UnderWeight");
		 else if(BMI>18.5 && BMI<25)
			 System.out.println("Your Category is Normal");
		 else if(BMI>25 && BMI<30)
			 System.out.println("Your Category is OverWeight .");
		 else
			 System.out.println("Your Category is Obese");
		// TODO Auto-generated method stub

	}

}
