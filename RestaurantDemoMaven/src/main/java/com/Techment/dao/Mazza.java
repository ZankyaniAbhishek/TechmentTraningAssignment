package com.Techment.dao;


import org.springframework.stereotype.Repository;

@Repository
public class Mazza implements ISoftDrink {public Mazza() {
	
}
	public void drink() {
		System.out.println("Drinking Mazza");

	}

}
