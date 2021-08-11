package com.Techment.Day8.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Product 
{
	int id,price, quantity;
	String Name;
	public Product(int id, int price, int quantity, String name) {
		super();
		this.id = id;
		this.price = price;
		this.quantity = quantity;
		Name = name;
	}
	@Override
	public String toString() {
		return "Product [id = " + id + ", price = " + price + ", quantity = " + quantity + ", Name = " + Name + "]";
	}
	
	
	
}

class QuantitySorting implements Comparator<Product>
{

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		if(o1.quantity >o2.quantity)
			return 1;
		else if(o1.quantity==o2.quantity)
			return 0;
		else 
			return -1;
		
	}
	
}


class PriceSorting implements Comparator<Product>
{

	@Override
	public int compare(Product o1, Product o2) 
	{
		// TODO Auto-generated method stub
		if(o1.price>o2.price)
			return -1;
		if(o1.price<o2.price)
			return 1;
		else
			return 0;
	}
	
}
public class ComparitorDemoPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Product> products = new ArrayList<Product>();
		products.add(new Product(1,1000,405,"Parle-G"));
		products.add(new Product(2,100,4008,"Oil"));
		products.add(new Product(3,5000,3001,"Coconut"));
		products.add(new Product(4,500,2006,"Rusk"));
		
		System.out.println("==============================Normal Display=========================================");
		for(Product emp: products )
		{
//			System.out.println(emp.id + "  " +emp.Name + "  "+emp.price + "   "+ emp.quantity );
			System.out.println(emp);
		}
		System.out.println("==============================Sorting================================================");
		
		Collections.sort(products,new QuantitySorting());
		
		for(Product emp: products )
		{
			if(emp.quantity>500)
			//System.out.println(emp.id + "  "+emp.Name +"  "+emp.price +"  "+ emp.quantity );
				System.out.println(emp);
		}
		
		System.out.println("============================Sorting by Name================================");

		Collections.sort(products,new PriceSorting());
		for(Product s :products)
		{
			System.out.println(s);
		}
		//System.out.println();
		

	}

}
