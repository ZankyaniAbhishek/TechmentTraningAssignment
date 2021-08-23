package com.Techment.day14.ClassTest;

import java.util.Scanner;

public class RepeatFont {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	RepeatFont font = new RepeatFont();
	System.out.println("The Output You Want :" +font.repeatFront("Chocolate", 4));
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter The String : ");
	String input = scanner.nextLine();
	System.out.println("Enter The Number : ");
	int number = scanner.nextInt();
	System.out.println(font.repeatFront(input, number));
	scanner.close();

	}
	
String repeatFront(String input,int number)
{
	if(number>input.length()|| number ==0)
	{
		return "Invalid Number";
				//+ " as the Number Exceeds the length"
	}
	else
	{
		String output ="";
		for(int i=(number);i>0;i--)
		{
			output+=input.substring(0, i);
		}
	return output;
	}
	
	
}
}