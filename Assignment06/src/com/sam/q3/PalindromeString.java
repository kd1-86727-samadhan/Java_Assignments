package com.sam.q3;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str  = sc.next();
		
		String rev = "";
		
		for (int i = 0; i < str.length(); i++) {
			rev = str.charAt(i) + rev;
		}
		
		System.out.println("Reverse string: " + rev);
		if(str.equals(rev))
			System.out.println(str + " is a palindrome string");
		else
			System.out.println(str + " is not a palindrome string");
	}
}
