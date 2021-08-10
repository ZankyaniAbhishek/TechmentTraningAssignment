package com.Techment.Day6.ExceptionHandling;

public class CustomeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		try
		{
			System.out.println(account.withdraw(200000));
		}
		catch(InSufficientFundException ex)
		{
			System.out.println(ex.getMessage());
		}
	}

}
