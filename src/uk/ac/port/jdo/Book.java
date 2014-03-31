package uk.ac.port.jdo;

import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable
public class Book extends Product {
	private String author;
	private String isbn;
	private String publisher;

	public Book(String name, String desc, double price, String author,
			String isbn, String publisher) {
		super(name, desc, price);
		this.author = author;
		this.isbn = isbn;
		this.publisher = publisher;
	}
}
