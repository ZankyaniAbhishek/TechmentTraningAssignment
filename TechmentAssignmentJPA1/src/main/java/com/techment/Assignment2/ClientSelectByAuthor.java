package com.techment.Assignment2;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ClientSelectByAuthor {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Query qry = em.createQuery("select p from Author1 p where p.name='Abhishek'");
		
		Object id =  qry.getSingleResult();
		
		
		Query qry1 = em.createQuery("SELECT d FROM Book1 e JOIN e.Author1 d", Author1.class);
		
		List<Book1> Book1s = (List<Book1>) qry1.getResultList();
		
		for(Book1 b:Book1s)
		{
			System.out.println(" name "+b.getTitle()+", Book1 Price "+b.getPrice());
		}
		

		em.getTransaction().commit();
	

	}

}
