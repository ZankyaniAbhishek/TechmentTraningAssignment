package com.Techment.ExceptionHandlingAssignment;

import java.lang.reflect.Constructor;
import java.util.Scanner;

class Customer
{
	private String custNo;
	private String custName;
	private String category;
	public Customer(String custNo, String custName, String category) {
		super();
		this.custNo = custNo;
		this.custName = custName;
		this.category = category;
	}
	public String getCustNo() {
		return custNo;
	}
	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Customer [custNo=" + custNo + ", custName=" + custName + ", category=" + category + "]";
	}
	
}

class InvalidInputException extends Exception
{
	public InvalidInputException (String msg)
	{
		super(msg);
	}
	
	
}
public class TestCustomer {

	public static void main(String[] args) 
	{
		try {

			Scanner scanner = new Scanner(System.in);
			System.out.println("Please Enter The Customer Number");
			String num = scanner.next();
			System.out.println("Please Enter The Name");
			String name = scanner.next();
			String check = name.toUpperCase().substring(0, 1);
			if(!name.toUpperCase().startsWith("C"))
			{
				throw new InvalidInputException("Name Should Always Start With c or C");
			}
			else if(name.length()<4)
					throw new InvalidInputException("Name Length Should be More than 4");
			else {
			System.out.println("Please Enter The Cateogry");
			String category = scanner.next();
			if(!category.equalsIgnoreCase("SILVER")&&!category.equalsIgnoreCase("platinium")&&!category.equalsIgnoreCase("gold"))
				{throw new InvalidInputException("Category is not valid");}
			else
			{
				Customer customer = new Customer(num, name, category);
				System.out.println(customer.toString());
			}
			}
			
			
			
		} catch (InvalidInputException  e) {
		System.out.println(e);	
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}

}
