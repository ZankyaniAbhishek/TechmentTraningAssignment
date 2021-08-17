package com.Techment.Day12.NewFeatures;
interface Bank
{
	//void add(int a ,int b)
	void display();
}

public class LamdaDemo {

	public static void main(String[] args) {
		
		
		Bank bank = ()->System.out.println("this is display method of interface");
		bank.display();
		
		Bank bank2 = ()->
		{
			System.out.println("This is Display Method");
			System.out.println("This is multi line body");
		};
		bank2.display();
		
	}

}
