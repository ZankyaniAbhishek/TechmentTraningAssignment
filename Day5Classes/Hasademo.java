package com.Techment.Day6Classes;

class Employee
{
	int id;
	String name;
	Address address;
	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	 void displayEmploeeinfo()
	 {
		 System.out.println("id : "+id);
		 System.out.println("name : "+name);
		 System.out.println("doorNo : "+address.doorNo);
		 System.out.println("StreetName : "+address.streetName);
		 System.out.println("city : "+address.city);
		 System.out.println("Pincode : "+address.pincode);
	 }
}
class Address
{
	int doorNo;
	String streetName;
	String city;
	int pincode;
	public Address(int doorNo, String streetName, String city, int pincode) {
		super();
		this.doorNo = doorNo;
		this.streetName = streetName;
		this.city = city;
		this.pincode = pincode;
	}
	 
}

public class Hasademo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address address = new Address(101, "Btn Street", "Bhilai", 491001);
		Employee employee = new Employee(11, "Vipul",address );
		employee.displayEmploeeinfo();

	}

}
