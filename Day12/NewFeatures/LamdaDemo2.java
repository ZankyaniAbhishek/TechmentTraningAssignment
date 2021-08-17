package com.Techment.Day12.NewFeatures;

interface Calculation
{
	void add(int a ,int b);
	}
public class LamdaDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Calculation calculation = (a,b)->System.out.println("Result : "+(a+b));
			calculation.add(2, 3);
			calculation.add(4, 5);
	}

}
