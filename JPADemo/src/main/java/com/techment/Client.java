package com.techment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
//Project Name JPADemo
public class Client {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em =  emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Product product = new Product();
		Product product2 = new Product();
		product.setId(3);
		product.setName("Washing Machine");
		product.setPrice(43000);
		product.setCategory("Daily");
		
		em.persist(product);
		
		
		
		product2.setId(7);
		product2.setName("I Phone11");
		product2.setPrice(150000);
		product2.setCategory("Telecom");
		
		em.persist(product2);
		
		Product product3 = new Product();
		
		product3.setId(6);
		product3.setName("Samsung12");
		product3.setPrice(45000);
		product3.setCategory("Telecom");
		
		em.persist(product3);
		
		
		
		em.getTransaction().commit();
		

	}

}
