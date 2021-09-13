package com.techment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyTesting1 {

	Calculation Calculation = new com.techment.Calculation();
	
	 static int i =1;
	 static int j =1;
	@BeforeEach
	public void Test()
	{
		
		System.out.println(" This is Before : " + i);
		i++;
		
	}
	
	
	
	@Test
	void test() 
	{
		System.out.println("Test Case Number : " + j);
		j++;
		assertEquals(9, Calculation.getcube(3));
		
	}
	

	@Test
	void test2() 
	{
		assertNotEquals(9, Calculation.getcube(3));
		System.out.println("Test Case Number : " + j);
		j++;
	}
	

	@Test
	void test3() 
	{
		System.out.println("Test Case Number : " + j);
		j++;
		assertEquals(9, Calculation.findMax(new int[] {5,6,7,8,9}));
		
	}
	
	@Test
	void test4() 
	{
		System.out.println("Test Case Number : " + j);
		j++;
		assertFalse(Calculation.name.contains("d"));
		//assertEquals(9, Calculation.findMax(new int[] {5,6,7,8,9}));
		
	}
	
	

}
