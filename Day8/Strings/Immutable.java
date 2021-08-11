package com.Techment.Day8.Strings;

public class Immutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String courseName = "Java";
			System.out.println("Course Name is : "+courseName);
			courseName.concat("Programming");
			System.out.println("After Concatinate : " + courseName);
			courseName = courseName.concat(" Language");//we can assign
			System.out.println("After Concatinate : " + courseName);
	}

}
