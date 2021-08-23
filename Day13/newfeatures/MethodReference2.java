package com.Techment.Day13.newfeatures;
@FunctionalInterface
interface Calculate2
{
	int add(int a ,int b);
}
class Add
{
	int addition(int a ,int b)
	{
		return a+b;
	}
}
class Sub
{
	int Subtract(int a ,int b)
	{
		return a-b;
	}
}


public class MethodReference2 {
public static void main(String[] args) {
	//by using Lamda
	Calculate2 cal = (a,b)->a+b;
	System.out.println(cal.add(4, 6));
	
	Calculate2 cal2 = (a,b)->a-b;
	System.out.println(cal2.add(18, 7));
	
	//By using Method Reference
	Add add = new Add();
	Sub sub =new Sub();
	Calculate2 c1 =  add::addition;
	System.out.println(c1.add(18, 96));
	Calculate2 c2 = sub::Subtract;
	//System.out.println(c2.s (18, 96));
	System.out.println(c2.add(77, 87)); 
	
	}
}
