package com.Techment.demo;

import java.util.Scanner;

public class TechmentAssignment31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Table Number You Want : ");
		int table = scanner.nextInt();
		for(int i = 1;i<=10;i++)
		{
			System.out.println(table +" * "+i+" = "+table*i);
		}
		scanner.close();
		

	}

}
