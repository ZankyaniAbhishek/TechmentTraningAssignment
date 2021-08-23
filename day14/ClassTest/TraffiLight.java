package com.Techment.day14.ClassTest;

import java.util.Scanner;

public class TraffiLight {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose The Signal : 1.Red 2.Yello 3.Green");
		String choice = scanner.next();
		if(choice.equalsIgnoreCase("1")||choice.equalsIgnoreCase("red"))
			System.out.println("Stop Please");
		else if(choice.equalsIgnoreCase("2")||choice.equalsIgnoreCase("Yello"))
			System.out.println("Get Ready");
		else if(choice.equalsIgnoreCase("3")||choice.equalsIgnoreCase("green"))
			System.out.println("Go Please");
		else
			System.out.println("Enter a valid Choice");


	}

}
