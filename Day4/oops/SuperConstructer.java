package com.Techment.Day4.oops;

class Parent1
{
	int a ;
	Parent1(int a)
	{
		System.out.println("This Is Parent Class Constructor"+a);
	}
}
class Child1 extends Parent1
{
	Child1(int x){
		super(x);
		System.out.println("This Is Child Class Constructor");
	}
	
}
public class SuperConstructer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Child1 child1 = new Child1(15);
	}

}
