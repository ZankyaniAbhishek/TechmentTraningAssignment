package com.Techment.Day6.ExceptionHandling;

class LateException extends Exception
{
	public LateException(String msg)
	
	{
		super(msg);
	}
}
class Student1
{
	void login(int time) throws LateException
	{
		if(time>9)
			throw new LateException("You Are Absent");
		else
			System.out.println("You are Present");
	}
}

public class CustomCheckedException {

	public static void main(String[] args) throws LateException {
		// TODO Auto-generated method stub

		Student1 student = new Student1();
		student.login(10);
	}

}
