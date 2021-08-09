package com.Techment.demo;

import java.util.Arrays;
import java.util.Scanner;

public class Assignmentquestion43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner sc=new Scanner(System.in);
			System.out.println("enter string");
			String a=sc.nextLine();
			String[]b=a.split(" ");
			Arrays.sort(b);
			System.out.println(Arrays.toString(b));
			sc.close();


	}

}
