package com.sam.product;

import java.util.Scanner;

public class Book extends Product {
	private String author;

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(int pId, String title, double price, String author) {
		super(pId, title, price);
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter the author: ");
		author = sc.next();
	}

	public void dislay() {
		super.dislay();
		System.out.println("Author: " + author);
	}

}
