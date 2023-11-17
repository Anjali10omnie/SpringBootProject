package com.graphQL.Example.service;

import java.util.List;
import java.util.Optional;

import com.graphQL.Example.Entity.Book;

public interface BookService {
	
	public Book create(Book book);
	public 	List<Book>getAllBook();
	public Book getBookById(int bookId);
	public Book updateBook(Book book);

}
