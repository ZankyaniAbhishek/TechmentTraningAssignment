package com.techment.Assignment2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ClientApplicationForLibrary {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Author1 Abhishek = new Author1("Abhishk");
		Author1 Manish = new Author1("Manish");

		
		
		Book1 java = new Book1("Java", 1000,Abhishek);
		Book1 python = new Book1("Python", 3500,Abhishek);
		Book1 sql = new Book1("SQL", 1500,Manish);
		Book1 Django = new Book1("Django", 650,Manish);

		Set<Book1> books1 = new HashSet();
		Set<Book1> books2 = new HashSet();

		books1.add(java);
		books1.add(python);
		books2.add(sql);
		books2.add(Django);
		

		Abhishek.setBooks(books1);
		Manish.setBooks(books2);
		 
	
		em.persist(java);
		em.persist(python);
		em.persist(sql);
		em.persist(Abhishek);
		em.persist(Manish);

		em.getTransaction().commit();
		System.out.println("Inserted");
	}
	
}
