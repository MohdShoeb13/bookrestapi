package com.book.api.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Book {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "book_id")
	private int bookId;
	
	private String title;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Author author;

	public Book(int bookId, String title, Author author) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
	}
		
	
}
