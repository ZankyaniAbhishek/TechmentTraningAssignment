package com.Techment.Day13.newfeatures;

interface Calculation
{
	void display();
}

class Hello
{
	void message()
	{
		System.out.println("Today Is Holiday");
	}
}

public class MethodReference1 {

	
	public static void main(String[] args) {
		
		
		// By using Lamda Expression
			Calculation calculation = ()->System.out.println("This is Display Method");
			calculation.display();
		
			
			//Using Method Reference to a non static method or instance method
			Hello hello = new Hello();
			Calculation cal = hello::message;
			cal.display();
			
			
			
			
	}

}
