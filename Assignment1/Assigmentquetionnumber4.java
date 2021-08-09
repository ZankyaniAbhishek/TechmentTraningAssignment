package com.Techment.demo;
import java.util.*;

public class Assigmentquetionnumber4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year");
		int year = sc.nextInt();
		if(year %4==0||year % 400==0)
		{
			System.out.println("Is a Leap Year");
		}
		else
			System.out.println("Not A Leap Year");
	}

}
