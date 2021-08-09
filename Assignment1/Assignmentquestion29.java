package com.Techment.demo;

import java.util.Scanner;

public class Assignmentquestion29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three sides");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>0&&b>0&&c>0) {
			int a1=a*a;
			int b1=b*b;
			int c1=c*c;
			if(c1==a1+b1||b1==a1+c1||a1==b1+c1) {
				System.out.println("right angle triangle");
			}
			else {
				System.out.println("not a right angle triangle");
			}
		}
		else {
			System.out.println("invalid ");
		}
sc.close();
	}

}
