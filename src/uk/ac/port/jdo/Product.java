package uk.ac.port.jdo;

import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable
public class Product {
	protected String name;
	protected String description;
	protected double price;
	
	protected Product() {
		this.name = "";
		this.description = "";
		this.price = 0.0;
	}
	
	public Product(String name, String description, double price) {
		this.name = name;
		this.description = description;
		this.price = price;
	}
}
