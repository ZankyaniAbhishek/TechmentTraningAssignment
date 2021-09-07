package com.techment;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.techment.dao.IProductDao;
import com.techment.entity.Product;

@SpringBootApplication
public class SpringBootJpaApplication implements CommandLineRunner {

	@Autowired
	IProductDao dao;
	public static void main(String[] args)  {
		SpringApplication.run(SpringBootJpaApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception
	{
		System.out.println("Hello World this is just for testing Application");
		
//		Product product1 = new Product("dell", "Laptop", 55000);
//		Product product2 = new Product("Mi", "Phone", 15000);
//		
//		dao.save(product1);
//		dao.save(product2);
		System.out.println("Inserted");
		
		List<Product> products = dao.findAll();
		
		System.out.println();System.out.println("==========Products=====================");
		products.forEach(System.out::println);
		System.out.println("===============================Over============================");
		
		System.out.println("==================Finding======================");
		Optional<Product> product = dao.findById(3);
		if(product.isPresent())
		{
			
			System.out.println("Present : "+product.get());
		}
		else
		{
			System.out.println("Not find in the list");
		}
		System.out.println();
		System.out.println("=============================Find Completed======================");
		
		long count = dao.count();
		System.out.println("All elemnts Count is : "+count);
		System.out.println("=============================");
		System.out.println();
		
		
		if(dao.existsById(5))
		{
			dao.deleteById(5);
			System.out.println("deleted");
			
		}
		else
		{
			System.out.println("No data at the given position");
		}
		
//		for(Product p :products)
//		{
//			System.out.println();
//			System.out.println(p);
//			System.out.println();
//		}
		
		List<Product> product2 =dao.findByName("Dell");
		System.out.println("Product : "+product2);
		
		List<Product> product3 =dao.findByCategory("Phone");
		System.out.println("Product : "+product3);
		

		List<Product> product4 =dao.findByNameAndCategory("dell", "Laptop");
		System.out.println("Product with name and category : "+product4);
		
	}

}
