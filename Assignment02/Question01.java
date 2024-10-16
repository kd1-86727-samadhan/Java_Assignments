/*Q1. Accept a integer number and when the program is executed print the binary, octal and 
hexadecimal equivalent of the given number. */

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();

		System.out.println("toBinaryString() : " + Integer.toBinaryString(num));
		System.out.println("toOctalString()	 : " + Integer.toOctalString(num));
		System.out.println("toHexString()	 : " + Integer.toOctalString(num));

	}

}
