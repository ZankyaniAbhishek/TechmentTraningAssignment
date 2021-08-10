package com.Techment.Day6.ExceptionHandling;

public class Account {

	int balance =5000;
	String withdraw(int amount) throws InSufficientFundException
	{
		if(amount>balance)
			throw new InSufficientFundException("Insufficient Fund");
		else
			return "you have to withdraw "+amount +"amount";
		
	}
}
