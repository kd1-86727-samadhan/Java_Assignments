package com.app.geometry;

import java.util.Scanner;

public class Point2D {
	int x;
	int y;

	public Point2D() {
		System.out.println("Point2D Default Constructor");
	}

	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void accept() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x-axis value: ");
		setX(sc.nextInt());

		System.out.println("Enter y-axis value: ");
		setY(sc.nextInt());
	}

	public String getDetails() {

		return "(x = " + x + ", y =" + y + ")";
	}

	public boolean isEqual(Point2D p2) {

		if ((this.x == p2.x) && (this.y == p2.y))
			return true;
		else
			return false;
	}

	public void calculateDistance(Point2D p2) {
		System.out.println("Obj1: " + this.getDetails());
		System.out.println("Obj2: " + p2.getDetails());
		double dx = this.x - p2.x;
		double dy = this.y - p2.y;
		double distance = Math.sqrt(Math.pow(dx, 2) + Math.pow(dx, 2));
		System.out.printf("Distance = %.2f", distance);
	}
}
