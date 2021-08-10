package com.Techment.OOPs.Assignment;

import java.util.Random;
import java.util.Scanner;

abstract class Medicine
{
	int price;
	String Expirydate;
	
	void getDetails(int price, String expirydate)
	{
		this.price = price;
		Expirydate = expirydate;
		/*System.out.println("Price is : "+price);
		System.out.println("Edxpity Date is : ");*/
	}
	abstract void displayLabel();
}

class Tablet extends Medicine
{

	@Override
	void displayLabel() {
		// TODO Auto-generated method stub
		System.out.println("Medicine type is TABLET , Price of the medicine is : " + price);
		System.out.println("Medicine Expiry Dated is : " + Expirydate);
		System.out.println("Store in a dry place");
	}
	
}

class Syrup  extends Medicine
{

	@Override
	void displayLabel() {
		// TODO Auto-generated method stub
		System.out.println("Medicine type is Syrup , Price of the medicine is : " + price);
		System.out.println("Medicine Expiry Dated is : " + Expirydate);
		System.out.println("Store in a cool place");
		
	}
	
}

class Ointment  extends Medicine
{

	@Override
	void displayLabel() {
		// TODO Auto-generated method stub
		System.out.println("Medicine type is Oinment , Price of the medicine is : " + price);
		System.out.println("Medicine Expiry Dated is : " + Expirydate);
		System.out.println("Store in a cool dry place");
		
	}
	
}
public class TechmentAssignmentAbstractionInheritanceInheritanceandAbstraction5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
     Medicine[] medicine=new Medicine[5];
     for(int i=0;i<medicine.length;i++) {
    	 //Medicine medicine1=new Medicine();
    	 //Medicine medicine1 = new Syrup();
    	 
    	 Medicine tablet=new Tablet();
         Medicine syrup=new Syrup();
         Medicine oitment=new Ointment();
         Random random=new Random();
         int n=random.nextInt(3);
         if(n==1) {
        	 System.out.println("Price of Tablet : ");
        	 int price=sc.nextInt();
        	 System.out.println("Expiry date of Tablet : ");
        	 String expiryDate=sc.next();
        	 tablet.getDetails(price,expiryDate);
        	 tablet.displayLabel();
        	 //tablet.displayLabel();
         }
         else if(n==2) {
        	 System.out.println("Price of Syrup : ");
        	 int price=sc.nextInt();
        	 System.out.println("Expiry date of Syrup : ");
        	 String expiryDate=sc.next();
        	 syrup.getDetails(price,expiryDate);
        	 //syrup.displayLabel();
        	 syrup.displayLabel();
         }
         else if(n==3) {
        	 System.out.println("Price of Oitment: ");
        	 int price=sc.nextInt();
        	 System.out.println("Expiry date of Oitment : ");
        	 String expiryDate=sc.next();
        	 oitment.getDetails(price,expiryDate);
        	 //oitment.displayLabel();
        	 oitment.displayLabel();
         }
         
    	 
    	
    	 //Medicine.add(medicine);
     }
     
	}

}
