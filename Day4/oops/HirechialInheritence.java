package com.Techment.Day4.oops;

class Human
{
	String Name;
	String Surname;
	String Gender ;
}
class Boy extends Human
{
	
	public void Display(String Name,String Surname)
	{
		super.Gender="Boy";
		super.Name=Name;
		super.Surname=Surname;
		System.out.println("The Name is : "+Name+" "+Surname);
		System.out.println("The Gender is : "+Gender);
		System.out.println();
	}
}
class Girl extends Human
{
	public void Display(String Name,String Surname)
	{
		super.Gender="Girl";
		super.Name=Name;
		super.Surname=Surname;
		System.out.println("The Name is : "+Name+" "+Surname);
		System.out.println("The Gender is : "+Gender);
		System.out.println();
	}
}
public class HirechialInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boy boy = new Boy();
		Girl girl =new Girl();
		boy.Display("Ram", "Kumar");
		girl.Display("Rama", "Kumari");

	}

}
