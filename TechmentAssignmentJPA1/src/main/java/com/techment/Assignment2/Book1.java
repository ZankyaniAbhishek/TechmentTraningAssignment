package com.techment.Assignment2;

import java.util.List;

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
@Table(name="Book786")
public class Book1 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ISBN;
	private String title;
	private double price;
	
	@ManyToOne
	@JoinColumn(name="auth_id")
	private Author1 author;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Book1() {
		
	}
	public Book1(String title, double price, Author1 author) {
		super();
		this.title = title;
		this.price = price;
		this.author = author;
	}
	
	
	
	
	
}