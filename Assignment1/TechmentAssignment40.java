package com.Techment.demo;

import java.util.Scanner;

public class TechmentAssignment40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Specify the value of 'n' for nxn Matrix : ");
		int n = scanner.nextInt();
		int matrix1[][]= new int[n][n];
		for(int i =0;i<matrix1.length;i++)
		{
			for(int j=0;j<matrix1[i].length;j++)
			{
				System.out.println("Enter the value of 1st Matrix's Row "+(i+1)+" Column "+(j+1)+" value : ");
				matrix1[i][j]=scanner.nextInt();
			}
		}
		System.out.println();
		System.out.println("Given Matrix is : ");
		System.out.println();
		for(int i =0;i<matrix1.length;i++)
		{
			for(int j=0;j<matrix1[i].length;j++)
			{
				System.out.print(" "+matrix1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Mirror Image of the Matrix is : ");
		System.out.println();
		for(int i =0;i<matrix1.length;i++)
		{
			for(int j=0;j<matrix1[i].length;j++)
			{
				System.out.print(" "+matrix1[i][n-1-j] + " ");
			}
			System.out.println();
		}

	}

}
