package com.techment.Assignment2;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="author201")
public class Author1 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;

	@OneToMany(mappedBy = "author",cascade = CascadeType.ALL)
	Set<Book1> books;

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Book1> getBooks() {
		return books;
	}

	public void setBooks(Set<Book1> books) {
		this.books = books;
	}

	public Author1() {
		
	}

	public Author1(String name) {
		super();
		this.name = name;
		
	}
	
	
	
	
	
	
}