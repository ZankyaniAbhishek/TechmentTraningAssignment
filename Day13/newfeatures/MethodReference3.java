package com.Techment.Day13.newfeatures;
@FunctionalInterface
interface Calculation3
{
	int add(int a, int b);
}
class CollectionUtility

{
	static int Addition(int a , int b) {
		return a+b;
	}
	static int subtraction(int a ,int b)
	{
		return a-b;
	}
}
public class MethodReference3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation3 cal1 = (a,b)->a+b;
		System.out.println(cal1.add(55, 65));
		
		
		Calculation3 cal2 = (a,b)->a-b;
		System.out.println(cal2.add(18, 7));
		
		//By using Method Reference
		CollectionUtility add = new CollectionUtility();
		CollectionUtility sub =new CollectionUtility();
		Calculation3 c1 =  CollectionUtility::Addition;
		System.out.println(c1.add(18, 96));
		Calculation3 c2 = CollectionUtility::subtraction;
		//System.out.println(c2.s (18, 96));
		System.out.println(c2.add(77, 87)); 
	}

}
