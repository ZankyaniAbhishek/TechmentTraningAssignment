package com.Techment.ArrayAssignment;

import java.util.Scanner;

public class ArrayAssignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Specify the value of 'n' for nxn Matrix : ");
		int n = scanner.nextInt();
		int matrix1[][]= new int[n][n];
		int matrix2[][]= new int[n][n];
		int matrixsum[][]= new int[n][n];
		for(int i =0;i<matrix1.length;i++)
		{
			for(int j=0;j<matrix1[i].length;j++)
			{
				System.out.println("Enter the value of 1st Matrix's Row "+(i+1)+" Column "+(j+1)+" value : ");
				matrix1[i][j]=scanner.nextInt();
			}
		}
		for(int i =0;i<matrix2.length;i++)
		{
			for(int j=0;j<matrix2[i].length;j++)
			{
				System.out.println("Enter the value of 2nd Matrix's Row "+(i+1)+" Column "+(j+1)+" value : ");
				matrix2[i][j]=scanner.nextInt();
				matrixsum[i][j]=(matrix1[i][j]+matrix2[i][j]);
			}
		}
		System.out.println();
		System.out.println("Enter the value of Matrix Sum is : ");
		System.out.println();
		for(int i =0;i<matrix2.length;i++)
		{
			for(int j=0;j<matrix2[i].length;j++)
			{
				System.out.print(" "+matrixsum[i][j] + " ");
			}
			System.out.println();
		}

	}

}
