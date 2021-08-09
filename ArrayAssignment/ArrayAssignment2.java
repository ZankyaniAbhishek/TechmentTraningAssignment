package com.Techment.ArrayAssignment;

import java.util.Scanner;

public class ArrayAssignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int marks[] = new int[5];
		int sum =0;
		int max=0,min=0,max2=0,result=0;
		 
		 //int number = scanner.nextInt();
		 //For insertion Of Marks
		 for (int i =0; i <5;i++)
		 {
			 System.out.println("Insert The Numbers of Array "+(i+1));
			 marks[i]=scanner.nextInt();
		 }
		 
		 
		System.out.println("Enter the Number You Want to Search : ");
		int search = scanner.nextInt();
		//To Get The Second Maximum Marks
		for(int i = 0;i<marks.length;i++)
		{
			if(marks[i]==search)
			{
				System.out.println("Search Element Found at Index : "+(i+1));
			}
			else
				result+=1;
			
		}
		
		if(result==marks.length)
			System.out.println("-1");
		
		scanner.close();

	}

}
