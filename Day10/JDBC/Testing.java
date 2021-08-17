package com.Techment.Day10.JDBC;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String d="Mumbai";
		String s="Bangalore";
		int C =100;
		//DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		   //LocalDateTime now = LocalDateTime.now();  
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The year");
		int year = sc.nextInt();
		System.out.println("Enter The Months");
		int month = sc.nextInt();
		System.out.println("Enter The Date");
		int day = sc.nextInt();		
		LocalDate ld = LocalDate.of(year, month, day);
		String date = ld.format(DateTimeFormatter.ofPattern("yyyyMMdd"));  
		String dated = ld.toString();
		System.out.println("PNR NUmber is : "+s.charAt(0)+d.charAt(0)+"_"+date+"_"+C);
		String myStr = Character.toString(s.charAt(0));
		//String myStr = Character.toString(s.charAt(0));
		String pnr = s.charAt(0)+Character.toString(d.charAt(0))+" "+d.charAt(0)+"_"+date+"_"+Integer.toString(C);
		System.out.println(pnr);
	
		

	}

}
