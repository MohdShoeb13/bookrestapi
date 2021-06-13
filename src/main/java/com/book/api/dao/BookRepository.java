package com.book.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book.api.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {
 public Book findById(int id);
}
