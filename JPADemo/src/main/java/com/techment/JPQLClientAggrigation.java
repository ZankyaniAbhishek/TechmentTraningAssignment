package com.techment;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JPQLClientAggrigation {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em =  emf.createEntityManager();

		System.out.println();
		System.out.println("========================================================== Aggrigation Operation ===========================================================");
		System.out.println();
		System.out.println("=========================================================== Count operation ===================================================================");
		System.out.println();

		em.getTransaction().begin();
		Query query = em.createQuery("Select count(p) from Product p");
		System.out.println("Number of Products are : "+query.getSingleResult());

		System.out.println();
		System.out.println("=========================================================== MAX operation ===================================================================");
		System.out.println();
		Query query2 = em.createQuery("Select Max(p.price) from Product p");
		System.out.println("Maximum Price Among All the Products Is : "+query2.getSingleResult());

		System.out.println();
		System.out.println("=========================================================== MIN operation ===================================================================");
		System.out.println();


		Query query3 = em.createQuery("Select MIN(s.price) from Product s");  
		System.out.println("Minimum age : "+query3.getSingleResult());  


		System.out.println();
		System.out.println("=========================================================== GROUP BY  operation ===================================================================");
		System.out.println();

		Query query4 = em.createQuery("Select p from Product p order by p.price desc");  

		@SuppressWarnings("unchecked")  
		List<Product> listAfterGroupBy =  query4.getResultList();  


		System.out.print("s_id");  
		System.out.print("\t \t s_name");  
		System.out.println("\t \t s_Price");  

		for(Product s:listAfterGroupBy)  
		{  
			System.out.print(s.getId());  
			System.out.print("\t \t"+s.getName());  
			System.out.println("\t \t"+s.getPrice());  
		  //System.out.println("\t \t"+ s.getCategory());
		}



		em.getTransaction().commit();  
//		em.close();  
//		emf.close();    

	}

}
