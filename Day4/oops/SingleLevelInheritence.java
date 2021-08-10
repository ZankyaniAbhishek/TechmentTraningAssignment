package com.Techment.Day4.oops;

class House
{
	int pincode;
	String Surname;
	String Address;
}
class Member extends House
{
	String Name;

	public Member(String name,int pin,String Surname,String Address) {
		super();
		Name = name;
		pincode =pin;
		super.Surname=Surname;
		super.Address=Address;
	}

	
	public void GetValue() {
		//return "Member  [Name=" + Name + ", pincode=" + pincode + ", Surname=" + Surname + ", Address=" + Address + "]";
		System.out.println("Name of the House Member is :"+ Name +" "+Surname);
		System.out.println("Pin Code of House Member is :"+ pincode);
		System.out.println("Address of the House Member is :"+ Address);
	}
	
	
}

public class SingleLevelInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member Member = new Member("Ashok", 491001, "Ravi", "Near Bit Durg");
		//System.out.println(Member);
		Member.GetValue();

	}

}
