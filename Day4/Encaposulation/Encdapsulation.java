package com.Techment.Day4.Encaposulation;

class Employee
{
	private int id;
	private String name;
	
	public void setId(int id)
	{
		this.id = id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
}


public class Encdapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.setId(5);
		emp.setName("Ram");
		System.out.println("The id is : "+emp.getId()+" And the Name is : "+ emp.getName());
	}

}
