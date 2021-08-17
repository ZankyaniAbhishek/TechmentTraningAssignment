package com.Techment.Day12.NewFeatures;
class Parent
{
	void Phone() {
		System.out.println("mi");
	}
}

public class AnonomysInnerClass {

	public static void main(String[] args) {
		
	
	Parent parent = new Parent();
	
	//System.out.println("")
	
	Parent parent2 = new Parent(){
		void Phone()
		{
			System.out.println("samsung");
		}
		};
		
		parent.Phone();
		parent2.Phone();
		
		
}}
