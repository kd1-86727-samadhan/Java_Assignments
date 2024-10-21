package com.sam.product;

import java.util.Scanner;

public class MainApp {

	private static void finalBill(Product[] parr) {

		double discountPrice = 0.0;
		double finalPrice = 0.0;
		boolean isDataEntered = false;
		for (int i = 0; i < parr.length; i++) {
			if (parr[i] != null) {
				isDataEntered = true;
				if (parr[i] instanceof Book) {

					discountPrice = parr[i].getPrice() - (parr[i].getPrice() * 0.10);
				} else {
					discountPrice = parr[i].getPrice() - (parr[i].getPrice() * 0.05);
				}
				finalPrice = finalPrice + discountPrice;
			}
		}

		if (!isDataEntered) {
			System.out.println("Please enter the data first.");
		} else {
			System.out.println("Final Bill: " + finalPrice);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Product[] parr = new Product[3];

		int choice = 0;
		int index = 0;
		do {
			System.out.println("---------------------------");
			System.out.println("*-*-*-*-*-Menu-*-*-*-*-");
			System.out.println("0. Exit");
			System.out.println("1. Add Book");
			System.out.println("2. Add Tape");
			System.out.println("3. Display Book");
			System.out.println("4. Display Tape");
			System.out.println("5. Display All Product");
			System.out.println("6. Final Bill");
			System.out.println("---------------------------");
			System.out.print("\nEnter your choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 0: {
				System.out.println("Thank you !!!!");
			}
				break;

			case 1: {
				System.out.println("Add Book");
				if (index < 3) {
					parr[index] = new Book();
					parr[index].accept(sc);
					System.out.println("Book added successfully");
					index++;
				} else {
					System.out.println("Array is full");
				}
			}
				break;

			case 2: {
				System.out.println("Add Tape");
				if (index < 3) {
					parr[index] = new Tape();
					parr[index].accept(sc);
					System.out.println("Tape added successfully");
					index++;
				} else {
					System.out.println("Array is full");
				}
			}
				break;

			case 3: {
				System.out.println("Display Book");
				System.out.println("---------------------------");
				for (int i = 0; i < parr.length; i++) {
					if (parr[i] != null && parr[i] instanceof Book) {
						parr[i].dislay();
					}
				}
			}
				break;

			case 4: {
				System.out.println("Display Tape");
				for (int i = 0; i < parr.length; i++) {
					if (parr[i] != null && parr[i] instanceof Tape) {
						parr[i].dislay();
					}
				}
			}
				break;

			case 5: {
				System.out.println("Display All Product");
				for (int i = 0; i < parr.length; i++) {
					if (parr[i] != null) {
						parr[i].dislay();
					}
				}
			}
				break;

			case 6: {
				System.out.println("Final Bill");
				finalBill(parr);
			}
				break;

			default:
				System.out.println("Invalid choice !!!!");
				break;
			} // switch
		} while (choice != 0);
	}

}
