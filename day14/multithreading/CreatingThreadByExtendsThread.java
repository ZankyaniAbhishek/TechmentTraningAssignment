package com.Techment.day14.multithreading;

class Message extends Thread
{
	public void run()
	{
		System.out.println("This is General Task");
	}
}


public class CreatingThreadByExtendsThread {

	public static void main(String[] args) {
		
		Message message = new Message();
		message.start();

	}

}
