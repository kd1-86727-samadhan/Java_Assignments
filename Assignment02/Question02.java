/*Q2. Display food menu to user. User will select items from menu along with the quantity. (eg 1. 
Dosa 2. Samosa 3. Idli ... 10 . Generate Bill ) Assign fixed prices to food items(hard code the prices) 
When user enters 'Generate Bill' option , display total bill & exit. 
(No need of any class, and no need to display the food details. Only display the total of orderd 
food) */

import java.util.Scanner;

public class Question02 {

	static Scanner sc = new Scanner(System.in);

	public static int menuChoice() {

		System.out.println("----------Menu----------");
		System.out.println("0. Generate Bill");
		System.out.println("1. Dosa");
		System.out.println("2. Samosa");
		System.out.println("3. Upama");
		System.out.println("4. Khichdi");
		System.out.println("5. Pohe");
		System.out.println("-------------------------");
		System.out.print("Enter your choice: ");
		int choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		int choice, quantity;
		double finalBill = 0;

		while ((choice = menuChoice()) != 0) {
			switch (choice) {

			case 0: {
				System.out.println("Thank you !");
			}
				break;

			case 1: {
				System.out.println("Dosa: 50 RS");
				System.out.println("Enter the quantity: ");
				quantity = sc.nextInt();
				finalBill = finalBill + 50 * (quantity);

			}

				break;

			case 2: {

				System.out.println("Samosa: 25 RS");
				System.out.println("Enter the quantity: ");
				quantity = sc.nextInt();
				finalBill = finalBill + 25 * (quantity);
			}
				break;

			case 3: {
				System.out.println("Upama: 20 RS");
				System.out.println("Enter the quantity: ");
				quantity = sc.nextInt();
				finalBill = finalBill + 20 * (quantity);
			}
				break;

			case 4: {
				System.out.println("Khichdi: 25 RS");
				System.out.println("Enter the quantity: ");
				quantity = sc.nextInt();
				finalBill = finalBill + 25 * (quantity);
			}
				break;

			case 5: {
				System.out.println("Pohe: 15 RS");
				System.out.println("Enter the quantity: ");
				quantity = sc.nextInt();
				finalBill = finalBill + 15 * (quantity);
			}
				break;

			default:
				System.out.println("Invalid Choice !!!!");
				break;

			}

		}

		System.out.println("Generate Bill: ");
		System.out.println("FinalBill amount: " + finalBill);
	}

}
