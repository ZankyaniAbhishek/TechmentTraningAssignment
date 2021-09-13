package com.techment;

public class Calculation {

	public int add(int a ,int b) {
		return a+b;
	}
	
	String checkEligibility(int age)
	{
		if(age>18)
			return "eligible";
		else
			return "Not Eligible";
	}
	String name = "Sachin";
	
	int findMax(int[] arr)
	{
		int max =0;
		for(int i =0;i<arr.length;i++)
		{
			if(max<arr[i])
				max=arr[i];
			
		}
		 return max;
	}
	
	int getcube(int edge)
	{
		return edge*edge*edge;
	}
}
