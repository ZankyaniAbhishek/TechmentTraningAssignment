package com.Techment.ExceptionHandlingAssignment;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import javax.swing.text.DateFormatter;

class calculateAge
{
	public calculateAge(String age) {
	try {
//			DateFormatter formatter = new DateFormatter();
//			DateTime
		
	} catch (Exception e) {
		
	}
	}
}
public class AgeCalculator1 {

	public static void main(String[] args) {
		try
		{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input the Date of Birth : ");
		LocalDate ld = LocalDate.parse("dd/MM/yyyy");
		
		}
		catch(Exception e )
		{
			System.out.println(e);
		}
	}

}
