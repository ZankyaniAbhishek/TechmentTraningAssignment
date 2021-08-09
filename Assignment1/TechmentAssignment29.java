package com.Techment.demo;

import java.util.Scanner;

public class TechmentAssignment29 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Base of the Triangle : ");
		float side1 = scanner.nextFloat();		
		System.out.println("Enter the Height of the Triangle : ");
		float side2 = scanner.nextFloat();
		System.out.println("Enter Hypotenuos of the Triangle : ");
		float side3 = scanner.nextFloat();			
		float squaresides= (float) (Math.pow(side1, 2)+Math.pow(side2, 2));
		if(squaresides==Math.pow(side3, 2))
			System.out.println("The Triangle Is Right Angled.");
		else
			System.out.println("The Triangle is Not Right Angled.");
		scanner.close();
		// TODO Auto-generated method stub

	}

}
