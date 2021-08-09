package com.Techment.demo;

import java.util.Scanner;

public class Assignmentquestion51 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any Number");  
		int num = sc.nextInt();  
		int n2 = num * 2;  
		int n3 = num * 3;  
	
		String sum = num + "" + n2 + n3;  
		boolean found = true;  
		
		for(char c = '1'; c <= '9'; c++)  
		{  
		int count = 0;  
		 
		for(int i = 0; i < sum.length(); i++)  
		{  
		char ch = sum.charAt(i);  
		if(ch == c)  
		
			count++;  
			}  
			 
			if(count > 1 || count == 0)  
			{  
			found = false;  
			break;  
			}  
			}  
			if(found)  
			System.out.println(num + " is a fascinating number");  
			else  
			System.out.println(num + " is not a fascinating number");
			sc.close();
	}

}
