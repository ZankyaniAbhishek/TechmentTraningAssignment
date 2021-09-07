package com.techment;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name = "BookExample1")
public class Book {

	@Id
	@GeneratedValue	(strategy = GenerationType.IDENTITY)
	int ISBN;
	
	String title;
	int price;
	
	@ManyToOne
	@JoinColumn(name="Authorid")
	Author author;

	public String getTitle() {
		return title;
	}

	public Book() {
		super();
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Book(String title, int price, Author author) {
		super();
		this.title = title;
		this.price = price;
		this.author = author;
	}
	
	
	
	
}
