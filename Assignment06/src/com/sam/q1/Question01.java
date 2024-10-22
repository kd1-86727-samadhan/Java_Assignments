package com.sam.q1;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.next();
		System.out.println("String: " + str);

		int length = str.length();
//		System.out.println("Length: " + length);
		if (length > 80)
			throw new ExceptionLineTooLong("The strings is too long.");

		System.out.println("String: " + str);
	}

}
