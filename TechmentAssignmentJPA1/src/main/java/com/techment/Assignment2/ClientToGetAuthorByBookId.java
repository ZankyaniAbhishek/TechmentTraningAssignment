package com.techment.Assignment2;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ClientToGetAuthorByBookId {

	public static void main(String[] args) {
		

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();


		Query qry = em.createQuery("select p from Book1 p where p.ISBN=3");
		
		Object id =  qry.getSingleResult();
		
		
		Query qry1 = em.createQuery("select p from Author1 p where p.id=id");
		
		
		
		
		List<Author1> Author1s = (List<Author1>) qry1.getResultList();
		
		for(Author1 b:Author1s)
		{
			System.out.println(" id "+b.getId()+" name "+b.getName());
		}
		

		em.getTransaction().commit();

	}

}
