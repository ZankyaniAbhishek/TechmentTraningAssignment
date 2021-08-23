package com.Techment.day14.ClassTest;

import java.util.Scanner;

class Personal
{
	int id,age;
	String name;
	public Personal(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
class InvalidAgeException  extends Exception  
{  
    public InvalidAgeException (String str)  
    {  
        // calling the constructor of parent Exception  
        super(str);  
    }  
}  
class InvalidNameException  extends Exception  
{  
    public InvalidNameException (String str)  
    {  
        // calling the constructor of parent Exception  
        super(str);  
    }  
}  


public class ExceptionHandling {

	public static void main(String[] args) {
		
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter id ");
			int id = scanner.nextInt();
			
			System.out.println("Enter name ");
			
			String name = scanner.nextLine();
			name+=scanner.nextLine();
			
			
			if(name.length()<=3)
				throw new InvalidNameException("Name should be more than 3 Charcters Please Give a proper name ");
			
			System.out.println("Enter age ");
			int age = scanner.nextInt();
			
			if(age==0 || age<=15)
				throw new InvalidAgeException("Age should be more than 15 Years");
			
			Personal person = new Personal(id,age,name);
			
			System.out.println("Name is : "+person.getName());
			System.out.println("Age is : "+person.getAge());
			
			
		}catch(InvalidAgeException e) {
			   System.out.println(e.getMessage());
		}catch(InvalidNameException e)
		{
			System.out.println(e.getMessage());
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		

		
	}

}



