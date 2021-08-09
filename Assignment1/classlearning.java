package com.Techment.demo;
class Car
{
	int model;//global Variable
	String color;
	int speed;
		
	Car(int model,String color){
		this.model=model;
		this.speed =speed;
	//System.out.println("This is Default Constructor");	
	}
	
	public String  Carspeed(int speed)
	{
			if(speed>50)
					return "Car Is running fast";
			else
				return "car is Moving Slow";
	}
	
}




public class classlearning {
public static void main(String[] args) {
	Car audi = new Car(1500,"Red");
	System.out.println("audi" + audi.Carspeed(150));
}
}
