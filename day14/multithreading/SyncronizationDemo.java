package com.Techment.day14.multithreading;

class Water
{
	public void drinkWater(int time) {
		
		synchronized (this) {
			
		
		
		for(int i=0;i<time;i++)
		{
			System.out.println(Thread.currentThread().getName() +" is drinking water " + (i+1) +" Times");
		}
		}
		for(int i=0;i<time;i++)
		{
			System.out.println(Thread.currentThread().getName() +" is Eating " + (i+1) +" Times");
		}
		
	}
}
class WaterBottle implements Runnable
{
	Water Water = new Water();

	@Override
	public void run() {

		Water.drinkWater(5);
	}
}

public class SyncronizationDemo {

	public static void main(String[] args) {
		WaterBottle bottle=new WaterBottle();
		Thread person1 = new Thread(bottle);
		Thread person2= new Thread(bottle);
		Thread person3= new Thread(bottle);
		

		person1.setName(" amit");
		person2.setName(" sanika");
		person3.setName(" parul");

		
		person1.start();
		person2.start();
		person3.start();
		
	}

}
