package com.Techment.Day6.ExceptionHandling;
class AgeException extends RuntimeException
{
	String mag;
	public AgeException(String msg)
	{
		this.mag = msg;
		//System.out.println(msg);
	}
}

class IdNotFoundException extends Exception
{
	String msg;

	public IdNotFoundException(String msg) {
		super();
		this.msg = msg;
	}
	
}

public class CustomException {

	public static void main(String[] args) throws IdNotFoundException {
		// TODO Auto-generated method stub

		throw new IdNotFoundException("Not found Id ");
		
	}

}
