package com.Techment.Day6Classes;

class Customer
{
	int custid;
	String custname;
	Account account ;
	public Customer(int custid, String custname, Account account) {
		super();
		this.custid = custid;
		this.custname = custname;
		this.account = account;
	}
	void DisplayAll() {
		System.out.println();
		System.out.println("Customer's Name is :" + custname);
		System.out.println("Customer's Id is :" + custid);
		System.out.println("Customer's Account No is :" + account.accountno);
		System.out.println("Customer's Account Type is :" + account.accounttype);
		System.out.println("Customer's Account Balance is :" + account.balance);
		System.out.println("Customer's Account IFSC is :" + account.ifse);
		System.out.println("Customer's Account Branch is :" + account.branch);
		
		System.out.println();
	}
}
class Account
{
	int accountno,balance;
	String accounttype,ifse,branch;
	public Account(int accdountno, int balance, String accounttype, String ifse, String branch) {
		super();
		this.accountno = accdountno;
		this.balance = balance;
		this.accounttype = accounttype;
		this.ifse = ifse;
		this.branch = branch;
	}
	
	
}
public class HomeworkoperationHasARelation2 {

	public static void main(String[] args) {
		
		Account account = new Account(182, 1000, "Savings", "UCBA00", "Nehrunagar"); 
		Customer customer = new Customer(1, "Ravi", account);
		customer.DisplayAll();
		

		Account account1 = new Account(183, 8000, "Savings", "UCBA01", "NehruNagar");
		Customer customer1 = new Customer(2, "Ram", account1);
		customer1.DisplayAll();
		
		
		
		// TODO Auto-generated method stub

	}

}
