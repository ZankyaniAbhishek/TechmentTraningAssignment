package com.Techment.OOPs.Assignment;

import java.util.Scanner;

class Book
{
	private int bookNo;
	private String title;
	private String author;
	private float price;
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Book(int bookNo, String title, String author, float price) {
		super();
		setBookNo(bookNo);
		setAuthor(author);
		setTitle(title);
		setPrice(price);
	}
	
	
}

class EngineeringBook 
{
	private String category;
	private Book book;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public EngineeringBook(String category, Book book) {
		super();
		this.category = category;
		this.book = book;
	}
	public void displayall() {
		System.out.println("The Category is : " + category);
		System.out.println("The Book Number of Book Is : " + book.getBookNo());
		System.out.println("the Author of the Book is : "+book.getAuthor());
		System.out.println("the Title of the Book is : "+book.getTitle());
		System.out.println("the Price of the Book is : "+book.getPrice());
	}

	
	
}

public class TechmentAssignmentEncapsulationInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Book Number : ");
		int booknumber = scanner.nextInt();
		//book.setBookNo(booknumber); 
		
		System.out.println("Enter the Book Title : ");
		String BookTitle = scanner.next();
		//book.setTitle(BookTitle);

		System.out.println("Enter the Book Author : ");
		String setAuthor = scanner.next();
		//book.setTitle(BookTitle);
		//book.setAuthor(setAuthor);
		
		System.out.println("Enter The Book Price : ");
		float Price = scanner.nextFloat();
		//book.setPrice(Price);
		Book book = new Book(booknumber,BookTitle,setAuthor,Price);
		System.out.println("Enter the Category of Book : ");
		String category = scanner.next();
		EngineeringBook engineeringBook = new EngineeringBook(category, book);
		engineeringBook.displayall();
		scanner.close();
		
		
		
	}

}
