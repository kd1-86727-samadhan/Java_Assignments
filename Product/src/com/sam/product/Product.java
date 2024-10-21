package com.sam.product;

import java.util.Scanner;

public abstract class Product {
	private int pId;
	private String title;
	private double price;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int pId, String title, double price) {
		this.pId = pId;
		this.title = title;
		this.price = price;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void accept(Scanner sc) {
		System.out.println("Enter the product id: ");
		pId = sc.nextInt();

		System.out.println("Enter the title: ");
		title = sc.next();

		System.out.println("Enter the price: ");
		price = sc.nextDouble();
	}

	public void dislay() {
		System.out.println("---------------------------");
		System.out.println("Product id: " + pId);
		System.out.println("Title: " + title);
		System.out.println("Price: " + price);
	}

}
