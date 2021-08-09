package com.Techment.demo;

import java.util.Scanner;

public class Assignmentquestion47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double sum = 0;
	        int n;
	        
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the no of series");
	        n = sc.nextInt();
	        Assignmentquestion47 obj = new Assignmentquestion47();
	        for(int i = 1; i <= n; i++)
	        {
	            sum = sum + (double)i / (obj.fact(i));
	        }
	        System.out.println("Sum of series:"+sum);sc.close();
	    }
	    int fact(int x)
	    {
	        int mul = 1;
	        while(x > 0)
	        {
	            mul = mul * x;
	            x--;
	        }
	        return mul;

	}

}
