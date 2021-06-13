package com.book.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.api.dao.BookRepository;
import com.book.api.entity.Book;

@Service
public class BookService {
    
	@Autowired
	private BookRepository bookRepository;
	
	public List<Book> getAllBooks(){
		return (List<Book>)this.bookRepository.findAll();
	}
	
	public Book getBookById(int id) {
		Book book = null;
		
		try {
			this.bookRepository.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return book;
	}
	
	public Book addBook(Book book) {
		Book result = bookRepository.save(book);
		return result;
	}
	
	public void deleteBook(int bookId) {
		bookRepository.deleteById(bookId);
	}
	
	public void updateBook(Book book, int bookId) {
		book.setBookId(bookId);
		bookRepository.save(book);
	}
}
