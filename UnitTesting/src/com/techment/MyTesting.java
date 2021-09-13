package com.techment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyTesting {

	Calculation calculation = new Calculation();
	
	
	@Before
	void test10()
	{
		//assertTrue(calculation.name.contains("d"));
		System.out.println("Before All ");
		assertTrue(true);
		
	}
	

	@BeforeEach
	void test11()
	{
		System.out.println("Before Term");
		assertTrue(true);
	}
	
	
	@Test
	void test() {
		//fail("Not yet implemented");
		System.out.println("Test 1 ");
		assertEquals(5, calculation.add(2, 4));
	}
	
	@Test
	void test2()
	{
		System.out.println("Test 2 ");
		assertNotEquals(5, calculation.add(2, 4));
	}
	
	@Test
	void test3()
	{
		System.out.println("Test 3 ");
		assertEquals("eligible", calculation.checkEligibility(19));;
	}
	
	@Test
	void test4()
	{
		System.out.println("Test 4 ");
		assertTrue(calculation.name.contains("d"));
	}
	

	@Test
	void test5()
	{
		System.out.println("Test 5 ");
		assertFalse(calculation.name.contains("d"));
	}
	

	@Test
	void test6()
	{
		System.out.println("Test 6 ");
		assertThrows(ArithmeticException.class, ()->{int a = 1; int b= 0; System.out.println(a/b);});
	}
	

	@Test
	void test7()
	{
		System.out.println("Test 7 ");
		assertThrows(IllegalAccessException.class, ()->{Integer.parseInt("ab");});
	}
	
	@Test
	void test8()
	{
		System.out.println("Test 8 ");
		assertThrows(IllegalAccessException.class, ()->{Integer.parseInt("1");});
	}
	


	
}
