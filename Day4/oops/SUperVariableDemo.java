package com.Techment.Day4.oops;
class Parent{
	
	int a = 10;
}
class Child extends Parent
{
	int a =20;
	public void sum() {
		int a = 5;
		
		int c = a+a;
		System.out.println("Sum Is :"+c);

		int d = this.a+a;
		System.out.println("Sum Is :"+d);

		int e = this.a+super.a;
		System.out.println("Sum Is :"+e);

		int f = super.a+a;
		System.out.println("Sum Is :"+f);
		
	}
}

public class SUperVariableDemo {

	public static void main(String[] args) {
		Child child = new Child();
		child.sum();
	}
	
}
