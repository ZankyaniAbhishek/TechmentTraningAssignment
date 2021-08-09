package com.Techment.demo;
import java.util.*;

public class Assigmentquetionnumber2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Today's Date");
		int date = sc.nextInt();
		if(date>31)
		{
			System.out.println("Please Enter a valid date");
		}
		else
		{
			//Scanner sc = new Scanner(System.in);
			System.out.println("Enter Your Car Number");
			int number = sc.nextInt();
			int carnumber =0 ;
			while(number>0)
			{
				carnumber = carnumber + number %10;
				number = number/10;
			}
			if(carnumber %2==0 && date %2==0)
			System.out.println("Today is Even day Your car is allowed");
			else if(carnumber %2!=0 && date %2!=0)
				System.out.println("Today is odd day Your car is allowed");
			else
				System.out.println("Sorry your car is not allowed today");
		}
	}
}
