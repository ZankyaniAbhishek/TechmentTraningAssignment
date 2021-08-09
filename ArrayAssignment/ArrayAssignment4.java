package com.Techment.ArrayAssignment;

import java.util.Scanner;

public class ArrayAssignment4 {
	public static void main(String[] args) {
		

		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter the Number of elements in First Array");
		 int number = scanner.nextInt();
		 System.out.println("Enter the Number of elements in Second Array");
		 int number2 = scanner.nextInt();
		 int number3 =number+number2;
		 int[] array1 = new int[number];
		 int[] array2 = new int[number2];
		 int[] array3 = new int[number3];
		 
		 for (int i =0; i < array1.length;i++)
		 {
			 System.out.println("Insert The Number in 1st Array");
			 int num =scanner.nextInt();
			 array1[i]=num;
			 array3[i]=num;
		 }
		 
		 for (int j =0; j < array2.length;j++)
		 {
			 System.out.println("Insert The Number in 2nd Array");
			 
			 array2[j]=scanner.nextInt();
			 array3[((number)+j)]=array2[j];
		 }
		 
		 for(int i = 0;i<array3.length;i++)
			{
			 for (int j =(i+1);j<array3.length;j++)
			 {
				 if(array3[i]>array3[j])
				 {
					 int swap=array3[j];
					 array3[j]=array3[i];
					 array3[i]=swap;
					 
				 }
			 }
			 System.out.println("Marks of Subject " +(i+1)+" is :"+array3[i]);
			}
		 
		 
	}
}
