package com.techment.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techment.Book;

public interface IBookDao extends JpaRepository<Book, Integer> {

//	public String addBook()
}
