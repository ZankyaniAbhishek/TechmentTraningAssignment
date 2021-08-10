package com.Techment.Day6Classes;

abstract class Bank
{
	void Eligibility()
	{
		System.out.println("Above 18 can open the Account");
	}
	abstract int rateofintrest(int interestRate);
}
//when any class extends abstract class means it need to provide the emplimentation of abstract method
class Axis extends Bank
{

	@Override
	int rateofintrest(int interestRate) {
		// TODO Auto-generated method stub
		interestRate = 2* interestRate;
		System.out.println("Axis bank " + interestRate);
		return interestRate;
	}
	
}

class Kotak extends Bank
{

	@Override
	int rateofintrest(int interestRate) {
		// TODO Auto-generated method stub
		System.out.println("kotak bank " + interestRate);
		return interestRate;
	}
	
}

public class Abstractiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank bank =  new Axis();
		System.out.println(bank.rateofintrest(5));

	}

}
