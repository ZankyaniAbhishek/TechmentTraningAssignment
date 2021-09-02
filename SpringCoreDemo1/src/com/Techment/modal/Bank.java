package com.Techment.modal;

public class Bank {
	String Name;
	String ifscCode;
	String Branch;
	public void setName(String name) {
		Name = name;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	Bank(String Branch)
	{
		this.Branch=Branch;
	}
	public void displayBankDetails()
	{
		System.out.println("Name :"+Name);
		System.out.println("Ifsc Code is  :"+ifscCode);
		System.out.println("Branch  :"+Branch);
		
	}

}
