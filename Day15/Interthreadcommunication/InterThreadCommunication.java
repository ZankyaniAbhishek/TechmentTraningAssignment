package com.Techment.Day15.Interthreadcommunication;

public class InterThreadCommunication {

	public static void main(String[] args) {
		Account account = new Account();
		Thread t1 = new Thread()
				{
				public void run()
				{
					System.out.println("After Withdraw Balance is "+account.withdraw(2000));
				}
				};
				Thread t2 = new Thread()
				{
				public void run()
				{
					System.out.println("After Deposit Balance is "+account.deposite(2000));
				}
				};
		t1.setName("Atm");
		t2.setName("Bank");
		t1.start();
		t2.start();
	}

}
