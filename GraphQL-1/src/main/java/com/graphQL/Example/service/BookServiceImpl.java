package com.graphQL.Example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graphQL.Example.Entity.Book;
import com.graphQL.Example.repo.BookRepository;

@Service
public class BookServiceImpl implements BookService{
	@Autowired
	private BookRepository bookRepository;
	
	@Override
	public Book create(Book book) {
	return	bookRepository.save(book);
	
	}

	@Override
	public List<Book> getAllBook() {
		return bookRepository.findAll();
		
	}

	@Override
	public Book getBookById(int bookId) {
		
		return bookRepository.getById(bookId);
	}

	@Override
	public Book updateBook(Book book) {
		
		return bookRepository.save(book);
	}
	
	
}
