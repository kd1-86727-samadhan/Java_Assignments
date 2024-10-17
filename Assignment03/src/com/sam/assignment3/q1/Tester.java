/*Q1. Create a class called Invoice that a hardware store might use to represent an invoice for an item 
sold at the store. An Invoice should include four pieces of information as fields—a part number 
(type String), a part description (type String), a quantity of the item being purchased (type int) and a 
price per item (double). Your class should have a constructor 
that initializes the four instance variables. Provide a set and a get method for each instance variable. 
calculates the invoice amount (i.e. multiplies the quantity by the price per item), then returns the 
amount as a double value. 
If the quantity is not positive, it should be set to 0. 
If the price per item is not positive, it should be set to 0.0. 
Write a test application named InvoiceTest that demonstrate class Invoice’s capabilities.*/


package com.sam.assignment3.q1;

public class Tester {

	public static void main(String[] args) {

		Invoice i1 = new Invoice();

		i1.accept();

		Invoice i2 = new Invoice();
		i2.accept();
		System.out.println(
				"First Name" + "\t\t" + "First Name" + "\t\t" + "Salary" + "\t\t" + "Price" + "\t\t" + "Total");
		i1.display();
		i2.display();
		System.out.println("--------------------------------------------------------------------------------------------------");
	}

}
