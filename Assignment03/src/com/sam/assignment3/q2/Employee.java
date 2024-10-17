package com.sam.assignment3.q2;

import java.util.Scanner;

public class Employee {
	Scanner sc = new Scanner(System.in);
	String firstName;
	String lastName;
	double salary;

	public Employee() {
		this.firstName = "";
		this.lastName = "";
		this.salary = 100.00;
	}

	public Employee(String firstName, String lastName, double salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	void accpetEmployee() {
		System.out.println("Enter the first name of employee: ");
		firstName = sc.next();

		System.out.println("Enter the last name of employee: ");
		lastName = sc.next();

		System.out.println("Enter the salary of employee: ");
		salary = sc.nextDouble();

	}

	void displayEmployee(double raisedSalary) {
		System.out.println(firstName + "\t\t" + lastName + "\t\t" + salary + "\t\t\t" + raisedSalary);
	}

}
