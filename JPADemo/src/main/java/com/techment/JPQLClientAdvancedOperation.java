package com.techment;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class JPQLClientAdvancedOperation {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em =  emf.createEntityManager();

		//em.getTransaction().begin();
		
		System.out.println("==============================Select Query ============================================================");
		Query query = em.createQuery("select p from Product p");

		List<Product> products = query.getResultList();

		for(Product p : products)
		{
			System.out.println(p.getId()+"  "+p.getName()+"  "+p.getPrice()+"  "+p.getCategory());

		}
		Query query2 = em.createQuery("select p.id from Product p");
		List<Integer> ids = query2.getResultList();
		for(Integer i : ids)
		{
			System.out.println(i);

		}

		System.out.println("=============== NamedQuery ====================");

		Query query3= em.createNamedQuery("findAllProduct");
		List<Product> list = query3.getResultList();
		for(Product p : products)
		{
			System.out.println(p.getId()+"  "+p.getName()+"  "+p.getPrice()+"  "+p.getCategory());

		}

		System.out.println();
		System.out.println("========================== Update Query =======================");
		System.out.println();
		em.getTransaction().begin();
		Query query4 = em.createQuery( "update Product p SET p.price=50000 where p.Id>2");
		query4.executeUpdate();
		em.getTransaction().commit();

		System.out.println();
		System.out.println("========================== Delete Query =======================");
		System.out.println();

		em.getTransaction().begin( );  


		Query query5 = em.createQuery( "delete from Product p where p.id=3");  

		query5.executeUpdate();  

		em.getTransaction().commit(); 


		System.out.println();
		System.out.println("========================== Between Query =======================");
		System.out.println();
		em.getTransaction().begin( );  
		Query q1 = em.createQuery("Select p from Product p where p.price between 10000 and 280000");  



		List<Product> l1 =  q1.getResultList();  

		//System.out.println("===================================Between Clause==============================================");  
		System.out.print("s_id");  
		System.out.print("\t s_name");  
		System.out.println("\t s_Price");  

		for(Product s:l1)  
		{  
			System.out.print(s.getId());  
			System.out.print("\t"+s.getName());  
			System.out.print("\t"+s.getPrice());
			System.out.print("\t"+s.getCategory());
			System.out.println();
		}  
		em.getTransaction().commit();


		System.out.println();
		System.out.println("========================== IN Clause Query =======================");
		System.out.println();
		em.getTransaction().begin( );  

		Query q2 = em.createQuery("Select p from Product p where p.Id IN(1,2,3)");  

		@SuppressWarnings("unchecked")  
		List<Product> BetweenList =  q2.getResultList();  

		System.out.println("IN Clause");  
		System.out.print("s_id");  
		System.out.print("\t s_name");  
		System.out.print("\t s_Price");
		System.out.print("\t s_Category");


		for(Product s:BetweenList)  
		{  
			System.out.println();
			System.out.print(s.getId());  
			System.out.print("\t"+s.getName());  
			System.out.print("\t"+s.getPrice());
			System.out.print("\t"+s.getCategory());
		}  



		em.getTransaction().commit();


		System.out.println();
		System.out.println("========================== Like Clause Query =======================");
		System.out.println();
		em.getTransaction().begin( );

		Query q3 = em.createQuery("Select p from Product p  where p.name like '%o%'");  

		@SuppressWarnings("unchecked")  
		List<Product> l3 =  q3.getResultList();  

		System.out.println("Like Clause");    
		System.out.print("s_id");  
		System.out.print("\t \t s_name");  
		System.out.print("\t \t s_Price");
		System.out.print("\t \t  s_Category");


		for(Product s:l3)  
		{  
			System.out.println();
			System.out.print(s.getId());  
			System.out.print("\t \t"+s.getName());  
			System.out.print("\t \t"+s.getPrice());
			System.out.print("\t \t"+s.getCategory());

			

		}
		em.getTransaction().commit();
		System.out.println();
		System.out.println("========================================================================================================================================");

	}
}
