package com.techment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JPQLClientDeleteOperation {

	public static void main(String[] args) {
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em =  emf.createEntityManager();
		System.out.println();
		System.out.println("========================== Delete Query =======================");
		System.out.println();

		em.getTransaction().begin( );  


		Query query5 = em.createQuery( "delete from Product p where p.id=3");  

		query5.executeUpdate();  

		em.getTransaction().commit();  


	}

}
