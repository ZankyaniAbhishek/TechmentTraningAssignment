package com.Techment.demo;
import java.util.*;
public class Assigmentquetionnumber5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Birth Month Number");
		int month = sc.nextInt();
		if(month>12)
			System.out.println("Invalid Input");
		else
		{
			switch(month) {
			
			case  1:
				System.out.println("Your Birth Month Is January");
	
			case  2:
				System.out.println("Your Birth Month Is Febuary");

			case  3:
				System.out.println("Your Birth Month Is March");

			case  4:
				System.out.println("Your Birth Month Is April");

			case  5:
				System.out.println("Your Birth Month Is May");

			case  6:
				System.out.println("Your Birth Month Is June");

			case  7:
				System.out.println("Your Birth Month Is July");

			case  8:
				System.out.println("Your Birth Month Is August");

			case  9:
				System.out.println("Your Birth Month Is September");

			case  10:
				System.out.println("Your Birth Month Is october");

			case  11:
				System.out.println("Your Birth Month Is November");

			case  12:
				System.out.println("Your Birth Month Is December");	
			
			
			}
		
	}
	}

}
