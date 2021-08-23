package com.Techment.day14.multithreading;

class Apple extends Thread
{
	public  void run()
	{
		for(int i =0;i<5;i++)
		System.out.println("Eat Apple"+Thread.currentThread().getName());
	}
}
class Banana extends Thread
{
	public  void run()
	{
		for(int i =0;i<5;i++)
		System.out.println("Eat Banana"+Thread.currentThread().getName());
	}
}


public class ThreadNaming {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		
		Apple a = new Apple();
		Banana b = new Banana();
		a.setName(" Apple Thread");
		b.setName(" Banana Thread");
		a.setPriority(10);
		//b.setPriority(1);
		a.start();
		b.start();

	}

}
