package com.Techment.Day15.Interthreadcommunication;

public class Account {
int balance = 0;
synchronized public int withdraw(int amount)
{
	if(amount>balance)
	{
		try {
			System.out.println("no balance waiting to deposit........");
			wait();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	System.out.println(Thread.currentThread().getName()+" is Going To Withdraw");
	balance-= amount;//balance = balance - amount
	return balance;
}
synchronized public int deposite(int amount)
{
	System.out.println(Thread.currentThread().getName()+" is Going to Deposit");
	balance+= amount;//balance = balance - amount
	notify();
	return balance;
}
}
