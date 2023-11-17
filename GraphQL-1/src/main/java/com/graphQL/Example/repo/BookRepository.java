package com.graphQL.Example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.graphQL.Example.Entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
