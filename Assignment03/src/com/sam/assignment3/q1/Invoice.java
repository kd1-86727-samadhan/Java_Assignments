
package com.sam.assignment3.q1;

import java.util.Scanner;

public class Invoice {
	private String partNumber;
	private String partName;
	private int quantity;
	private double price;

	public Invoice() {
//		this("1", "h/w", 1, 1); // Constructor Chaining
		this.partNumber = "";
		this.partNumber = "";
		this.quantity = 1;
		this.price = 1;
	}

	public Invoice(String partNumber, String partName, int quantity, double price) {
		this.partNumber = partNumber;
		this.partName = partName;
		this.quantity = quantity;
		this.price = price;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartName() {
		return partName;
	}

	public void setPartName(String partName) {
		this.partName = partName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the part number: ");
		partNumber = sc.next();

		System.out.println("Enter the part name: ");
		partName = sc.next();

		System.out.println("Enter the quantity: ");
		quantity = sc.nextInt();
		if (quantity < 0) {
			this.quantity = 0;
		} else {
			this.quantity = quantity;
		}

		System.out.println("Enter the price: ");
		price = sc.nextDouble();
		if (this.price < 0) {
			this.price = 0;
		} else {
			this.price = price;

//			setPrice(price);
		}

	}

	public void display() {
		System.out.println(
				"--------------------------------------------------------------------------------------------------");

		System.out.println(getPartNumber() + "\t\t\t" + getPartName() + "\t\t\t" + getQuantity() + "\t\t\t" + getPrice()
				+ "\t\t" + calculateInvoice());
	}

	public double calculateInvoice() {
		double amount;
		amount = price * quantity;
		return amount;
	}
}
