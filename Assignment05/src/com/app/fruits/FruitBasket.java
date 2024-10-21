package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {

	private static int menuChoice(Scanner sc) {
		int choice;
		System.out.println("\n-------------------------------------------------------------------------------");
		System.out.println("\t\t\t\t****Menu****");
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("0. Exit");
		System.out.println("1. Add Mango");
		System.out.println("2. Add Orange");
		System.out.println("3. Add Apple");
		System.out.println("4. Display names of all fruits in the basket.");
		System.out.println("5. Display name,color,weight , taste of all fresh fruits , in the basket. ");
		System.out.println("6. Display tastes of all stale(not fresh) fruits in the basket. ");
		System.out.println("7. Mark a fruit as stale");
		System.out.println("8. Mark all sour fruits stale (optional) ");
		System.out.println("-------------------------------------------------------------------------------");
		System.out.print("\nEnter your choice: ");
		choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice, size;

		System.out.println("Enter the size: ");
		size = sc.nextInt();

		Fruit[] fruit = new Fruit[size];
		int counter = 0;

		while ((choice = menuChoice(sc)) != 0) {
			switch (choice) {
			case 0: {
				System.out.println("Exit");
			}
				break;

			case 1: {
				System.out.println("Add Mango");
				if (counter < fruit.length) {
					fruit[counter] = new Mango();
					fruit[counter].accept(sc);
					counter++;
				} else {
					System.out.println("Fruit basket is full !!!! we cannot add fruit");
				}
			}
				break;

			case 2: {
				System.out.println("Add Orange");
				if (counter < fruit.length) {
					fruit[counter] = new Orange();
					fruit[counter].accept(sc);
					counter++;
				} else {
					System.out.println("Fruit basket is full !!!! we cannot add fruit");
				}
			}
				break;

			case 3: {
				System.out.println("Add Apple");
				if (counter < size) {
					fruit[counter] = new Apple();
					fruit[counter].accept(sc);
					counter++;
				} else {
					System.out.println("Fruit basket is full !!!! we cannot add fruit");
				}
			}
				break;

			case 4: {
				System.out.println("Display names of all fruits in the basket.");
				for (Fruit f : fruit) {
					if (f != null) {
						System.out.println(f.getName());
					} else {
						System.out.println("null");
					}

				}
			}
				break;

			case 5: {
				System.out.println("Display name, color, weight, taste of all fresh fruits , in the basket. ");
				for (Fruit f : fruit) {
					if (f != null) {
						if (f.isFresh()) {
							System.out.println(f);
						}
					} else {
						System.out.println("null");
					}
				}
			}
				break;

			case 6: {
				System.out.println("Display tastes of all stale(not fresh) fruits in the basket. ");
				for (Fruit f : fruit) {
					if (f != null) {
						if (!f.isFresh()) {
							System.out.println(f.taste());
						}
					} else {
						System.out.println("null");
					}
				}

			}
				break;

			case 7: {
				System.out.println("Mark a fruit as stale");
				System.out.println("Enter the index which is not fresh fruit: ");
				int index = sc.nextInt();

				if (index <= counter && index > -1) {
					fruit[index].setFresh(false);
				}
			}
				break;

			case 8: {
				System.out.println("Mark all sour fruits stale (optional)");

				for (Fruit f : fruit) {
					if (f.taste() == "sour") {
						f.setFresh(false);
					}
				}
			}
				break;

			default:
				System.out.println("Invalid Choice !!!!");
				break;
			}
		} // while
	}

}
