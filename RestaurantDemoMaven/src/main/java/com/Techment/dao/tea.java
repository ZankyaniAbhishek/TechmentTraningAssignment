package com.Techment.dao;


import org.springframework.stereotype.Repository;

@Repository
public class tea implements IHotDrink {

	public void drink() {
		System.out.println("Drinking Tea");

	}

}
