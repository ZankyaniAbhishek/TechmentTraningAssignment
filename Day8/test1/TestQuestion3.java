package com.Techment.Day8.test1;


import javax.naming.LinkException;

class Employee1
{
	private String FirstName;
	private String LastName;
	public Employee1(String firstName, String lastName) {
		super();
		FirstName = firstName;
		LastName = lastName;
		validate( firstName, lastName);
	}
	public void validate(String First, String Last)
	{
		try
		{
			if(First==null||Last==null)
			{
				System.out.println();
			}
			if(First.length()<4||Last.length()<4)
				throw new LinkException();
			else
				System.out.println("FIrst Name is :" + First + " Last Name is : "+ Last);
		}
		catch(NullPointerException ex)
		{
			System.out.println("Entry Missing .");
		}
		catch(LinkException ex)
		{
			System.out.println("name should be minimum 3 character");
		}
		
	}
	@Override
	public String toString() {
		return "Employee [FirstName=" + FirstName + ", LastName=" + LastName + "]";
	}
	
	
}
public class TestQuestion3 {

	public static void main(String[] args) {
		Employee1 emp = new Employee1("ree","ree");
			}

}
