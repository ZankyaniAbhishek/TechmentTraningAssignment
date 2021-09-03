package com.techment.Assignment2;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ClietToGetBooksByPrice {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Query qry = em.createQuery("select b from Book1 b where b.price between 500 and 3000");
		
		
		
		
		
		
		List<Book1> books = (List<Book1>) qry.getResultList();
		
		for(Book1 b:books)
		{
			System.out.println(" name "+b.getTitle()+", Book Price "+b.getPrice());
		}
		

		em.getTransaction().commit();

	}

}
