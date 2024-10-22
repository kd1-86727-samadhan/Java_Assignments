package com.sam.q2;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.next();
		String rev = "";
		for(int i = 0; i < str.length(); i++)
		{
			rev = str.charAt(i) + rev;
		}
		
		System.out.println("Reverse String: " + rev);

	}

}
