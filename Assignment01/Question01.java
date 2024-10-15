/*Q1. Accept 2 double values from User (using Scanner). Check data type. If arguments are not 
doubles, supply suitable error message & terminate. 
If numbers are double values, print its average.
*/

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two values: ");
		if (sc.hasNextDouble()) {
			if (!sc.hasNextInt()) {
				double n1 = sc.nextDouble();
				double n2 = sc.nextDouble();
				double average = (n1 + n2) / 2;
				System.out.println("Average: " + average);
			} else {
				System.out.println("Error- Int value entered");
				System.exit(0);
			}
		} else {
			System.out.println("Error- Char value entered");
			System.exit(0);

		}
	}

}
