package com.Techment.demo;

class Customer
{
	int id,minbalance;
	long contact;
	String name,accounttype;
	Customer(int id,String name,long contact,int minbalance){
		this.id=id;
		this.name = name;
		this.contact=contact;
		this.minbalance=minbalance;
		accounttype = checkaccounttype(this.minbalance);
	}
	public String checkaccounttype(int balance)
	{
		if(balance == 0)
			return "Zero Balance Account";
		else if(balance>0 && balance<1000)
			return"Savings Account";
		else
			return"Current Account";
	}
	public void Displaydetails() {
		System.out.println("The Customer id is : "+ id );
		System.out.println("The Customer Name is :  "+ name );
		System.out.println("The Customer Contact Number  is : " +contact);
		System.out.println("Type Of Account Customer has : " + accounttype);
		System.out.println();
	}
}

public class Classhomework4aug {
public static void main(String[] args) {
	Customer emp1 = new Customer(1, "Abhishek", 8770961, 2000);
	Customer emp2 = new Customer(2, "Yash", 8770969, 000);
	Customer emp3 = new Customer(3, "Lakshy", 8770962, 2000);
	emp1.Displaydetails();emp2.Displaydetails();emp3.Displaydetails();
}
}
