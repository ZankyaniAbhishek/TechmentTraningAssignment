package com.Techment.demo;

import java.util.Scanner;

public class Assignmentquestion48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter binary number");
		int n=sc.nextInt();
		int rem=0,sum=0,i=0;
		while(n>0) {
			rem=n%10;
			sum=sum+rem*(int)Math.pow(2, i++);
			n=n/10;
		}
		System.out.println(sum);
		sc.close();
	}

}
