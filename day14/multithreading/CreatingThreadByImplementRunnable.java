package com.Techment.day14.multithreading;



class Info implements Runnable
{

	@Override
	public void run() {
		System.out.println("this is my task");
		
	}
	
}
public class CreatingThreadByImplementRunnable {

	public static void main(String[] args) {
		Info info = new Info();
		//info.run();
		Thread thread = new Thread(info);
		thread.start();

	}

}
