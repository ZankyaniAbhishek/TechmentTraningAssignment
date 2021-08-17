package com.Techment.Day12.NewFeatures;

interface Calculation2
{
	int add(int a ,int b);
	}
public class LamdaDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Calculation2 calculation = (a,b)-> a+b;
			Calculation2 calculation2 = (a,b)->
			{
				if(a>b)
					return b;
				return b;
			};
			System.out.println("Calculating od single line : "+calculation.add(6, 7));
			System.out.println("Calculation of Multiline : "+calculation2.add(48, 97));;
	}

}
