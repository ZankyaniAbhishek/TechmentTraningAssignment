package com.Techment.ArrayAssignment;

import java.util.Scanner;

public class ArrayAssignment1 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		int marks[] = new int[5];
		
		int max=0,min=0,max2=0,min2=0;
		 
		 //int number = scanner.nextInt();
		 //For insertion Of Marks
		 for (int i =0; i <5;i++)
		 {
			 System.out.println("Insert The Numbers "+(i+1));
			 marks[i]=scanner.nextInt();
		 }
		
		
		 //For Displaying Sum of the marks
		
		min=marks[0];
		//For Taking Out Top Marks and Lowest Marks
		for(int i = 0;i<marks.length;i++)
		{
			if(marks[i]>max)
			{
				max=marks[i];
			}
			if(marks[i]<min)
			{
				min=marks[i];
			}
		}
		System.out.println("Maximum Number is : "+max);
		System.out.println("Minimum Number is : "+min);
		max2=max;
		//To Get The Second Maximum Marks
		for(int i = 0;i<marks.length;i++)
		{
			if((max-marks[i])< max2 &&(max-marks[i])!=0 )
			{
				max2=marks[i];
			}
			
		}
		System.out.println("Second Maximum Number is : "+max2);

		min2=max;
		//To Get The Second Minimum Marks
				for(int i = 0;i<marks.length;i++)
				{
					if(marks[i]>min)
					{
						if(marks[i]<min2)
						{
							min2=marks[i];
						}	
					}
				}
				System.out.println("Second Minimum Number is : "+min2);
		
		scanner.close();

	}

}
