package com.Techment.Day12.NewFeatures;

import java.awt.DisplayMode;

@FunctionalInterface
interface Bank1
{
	void  reteOfinterface();
	//void loan();
	default void DisplayMode()
	{
		System.out.println("This is a default Method");
	}
	static void loan()
	{
		System.out.println("You can Apply for Loan");
	}
}

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
