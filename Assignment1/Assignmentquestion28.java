package com.Techment.demo;

import java.util.Scanner;

public class Assignmentquestion28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int correctpin=12345;
		System.out.println("enter pin");
		int pin=sc.nextInt();
		while(correctpin!=pin) {
			System.out.println("enter correct pin");
			pin=sc.nextInt();
			if(pin==correctpin) {
				System.out.println("pin accepted");
			}
		}
		sc.close();

	}

}
