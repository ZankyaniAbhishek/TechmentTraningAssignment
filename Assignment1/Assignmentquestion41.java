package com.Techment.demo;

import java.util.Scanner;

public class Assignmentquestion41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int[] Array = new int[5];
		for(int i = 0;i<Array.length;i++)
		{
			System.out.println("Insert the "+ (i+1) + " Element Want Insert : " );
			Array[i]=scanner.nextInt();
		}
		for(int j =(Array.length -1);j>=0;j--)
		{
			System.out.println("Item Popped is : " + Array[j]);
		}
		scanner.close();
	}

}
