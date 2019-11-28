package com.ustglobal.springcore.di;

//import javax.annotation.PostConstruct;
//import javax.annotation.PreDestroy;

public class Book {
	
	private Author author;
	private String name;
	private int price;
	
	public Book() {
		System.out.println("book object created");
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	/*
	 * @PostConstruct public void init() {
	 * System.out.println("init method executing from hello"); }
	 * 
	 * @PreDestroy public void destroy() {
	 * System.out.println("destroy methhod executing from hello"); }
	 */
	

}
