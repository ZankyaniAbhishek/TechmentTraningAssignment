package com.Techment.demo;

public class TechmentAssignment36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 5;
		for (int i=0;i<5;i++)
		{
			for(int j=1;j<=counter;j++)
				System.out.print(j);
			if(counter<5)
			System.out.print(" ");
			for(int k =counter;k>0;k--)
			{
				System.out.print(k);
				
			}
			counter-=1;
			System.out.println();
		}

	}

}
