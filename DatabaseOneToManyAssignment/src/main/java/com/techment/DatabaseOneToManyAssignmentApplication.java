package com.techment;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.techment.dao.IAuthorDao;
import com.techment.dao.IBookDao;


@SpringBootApplication
public class DatabaseOneToManyAssignmentApplication implements CommandLineRunner {

	@Autowired
	IBookDao bookDao;
	
	@Autowired
	IAuthorDao authorDao;
	
	public static void main(String[] args)  {
		SpringApplication.run(DatabaseOneToManyAssignmentApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		Author Robert = new Author();
		Robert.setName("Robert");
		
		Author Manish = new Author();
		Manish.setName("Manish");
		
		Book flamngo = new Book("Flamingo", 500, Robert);
		Book Vitas = new Book("Vitaas", 1300, Manish);
		Book Atoms= new Book("Atoms", 2500, Robert);
		Book Allinone = new Book("All In One", 800, Manish);
		
		Set<Book> English = new HashSet<Book>();
		Set<Book> Physics = new HashSet<Book>();
		English.add(Vitas);
		English.add(flamngo);
		Physics.add(Atoms);
		Physics.add(Allinone);
		
		Manish.setBooks(Physics);
		Robert.setBooks(English);
		
		
		bookDao.save(flamngo);
		bookDao.save(Vitas);
		bookDao.save(Allinone);
		bookDao.save(Atoms);
		
		authorDao.save(Manish);
		authorDao.save(Robert);
		System.out.println("::::::::::::::::::::::::::::::::::::Inserted::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		
		
		
		
		
		
		
	}

}
