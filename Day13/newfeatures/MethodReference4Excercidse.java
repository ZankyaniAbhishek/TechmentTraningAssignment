package com.Techment.Day13.newfeatures;
@FunctionalInterface
interface LargeNumber
{
	int largest(int a,int b ,int c);
}

class Calculationutil
{
	int findLargest(int a,int b,int c)
	{
		if(a>b&&a>c)
			return a;

		else if(b>a&&b>c)
			return b;
		else
			return c;
	
	}
}

public class MethodReference4Excercidse {

	public static void main(String[] args) {

		LargeNumber largeNumber = (a,b,c)->
		{

			if(a>b&&a>c)
				return a;

			else if(b>a&&b>c)
				return b;
			else
				return c;
		};
		System.out.println("Lamda Function Output :" +largeNumber.largest(88, 98, 77));
		
		Calculationutil calculationutil = new Calculationutil();
		LargeNumber number = calculationutil::findLargest;
		System.out.println("By using Method Reference Output : " +number.largest(66, 99, 78));
	}

}
