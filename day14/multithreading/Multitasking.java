package com.Techment.day14.multithreading;

class Sanika extends Thread
{
	public void run()
	{
		for(int i =0;i<10;i++)
			System.out.println("Sanika "+(i+1)+" msg : Welcome to banglore");
		
	}
}


class Parul extends Thread
{
	public void run()
	{
		for(int i =0;i<5;i++)
		{
			try {
				sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Parul "+(i+1)+" msg : Takes Vaccination");
//			if(i>3)
//			{
//				try {
//					sleep(500);
//					System.out.println("Parul "+(i+1)+" msg : Takes Vaccination");
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
			}
		}
			
			
		
	}


class Amit extends Thread
{
	public void run()
	{
		for(int i =0;i<8;i++)
		{
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Amit "+(i+1)+" msg : Covid is not over Yet");
		}
			
		
	}
}

public class Multitasking {

	public static void main(String[] args) {
		
		Sanika sanika = new Sanika();
		Parul parul = new Parul();
		Amit amit = new Amit();
		
//		sanika.run();
//		parul.run();
//		amit.run();
//	
		sanika.start();
		parul.start();
		amit.start();
		}

}
