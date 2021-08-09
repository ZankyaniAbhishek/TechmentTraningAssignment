package com.Techment.demo;
import java.util.*;  

public class demo {
	public static void main(String[] args) {
		//System.out.println("Thank you bro");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two digit Number");
		int number = sc.nextInt();
		int solutiondoor = number/10 + number%10;
		if(solutiondoor>18)
		{
			System.out.println("No Exit Door");
		}
		else
		System.out.println("Solution Door Is : "+solutiondoor);
		

	}
}
//ok bro
