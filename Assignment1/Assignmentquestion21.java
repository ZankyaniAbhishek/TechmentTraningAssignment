package com.Techment.demo;
import java.util.Scanner;

class Product
{
	private int id;
	private String name;
	private int price;
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}

	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public int getPrice()
	{
		return price;
	}
}
public class Assignmentquestion21 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter How many products you want to Add");
		int Counter=scanner.nextInt();
		Product products[] =new Product[Counter];
		for(int i =1;i<=products.length;i++)
		{ 
			System.out.println("Enter the id of "+i+" Product : ");
			products[i].setId(scanner.nextInt());
			System.out.println("Enter the Name of "+(i+1)+" Product : ");
			products[i].setName((scanner.nextLine()));
			System.out.println("Enter the Price of "+(i+1)+" Product : ");
			products[i].setPrice(scanner.nextInt());
			
		}
		for(int i =0;i<products.length;i++)
		{ 
			System.out.println("Product id is "+ products[i].getId());
			System.out.println("Product Name is "+ products[i].getName());
			System.out.println("Product Price is "+ products[i].getPrice());
			//products[i].setId(scanner.nextInt());
			
		}
		scanner.close();
		// TODO Auto-generated method stub

	}

}
