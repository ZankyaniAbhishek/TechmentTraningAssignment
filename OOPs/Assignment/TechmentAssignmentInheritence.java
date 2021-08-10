package com.Techment.OOPs.Assignment;

interface Polygon 
{
	void calcArea( );
	void calcPeri( );
}

class Square implements Polygon
{
	float side;

	public Square(float side) {
		super();
		this.side = side;
	}

	@Override
	public void calcArea() {
		// TODO Auto-generated method stub
		System.out.println("Area Of the Square with side " + side + " is : " + (side*side));
	}

	@Override
	public void calcPeri() {
		// TODO Auto-generated method stub
		System.out.println("PereMeter Of the Square with side " + side + " is : " + (4*side));
	}
	
}

class Rectangle implements Polygon
{
	float Length;
	float breadth;

	public Rectangle(float length, float breadth) {
		super();
		Length = length;
		this.breadth = breadth;
	}

	@Override
	public void calcArea() {
		// TODO Auto-generated method stub
		System.out.println("Area Of the Square with Length " + Length + " and Breadth " + breadth + "  is : " + (Length*breadth));
	}
	@Override
	public void calcPeri() {
		// TODO Auto-generated method stub
		System.out.println("Area Of the Square with Length " + Length + " and Breadth " + breadth + "  is : " + (2*(Length+breadth)));
		
	}
	
}

public class TechmentAssignmentInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle = new Rectangle(12, 15);
		rectangle.calcArea();
		rectangle.calcPeri();
		Square square = new Square(18);
		square.calcArea();
		square.calcPeri();

	}

}
