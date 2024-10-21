package com.app.fruits;

import java.util.Scanner;

public abstract class Fruit {
	private String name;
	private String color;
	private double weight;
	private boolean isFresh = true;

	public Fruit() {
		// TODO Auto-generated constructor stub
	}

	public Fruit(String name) {
		this.name = name;
	}

	public Fruit(String name, String color, double weight) {
		this.name = name;
		this.color = color;
		this.weight = weight;
//		this.isFresh = isFresh;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	public void accept(Scanner sc) {
//		System.out.println("Enter the name: ");
//		name = sc.next();

		System.out.println("Enter the color: ");
		color = sc.next();

		System.out.println("Enter the weight: ");
		weight = sc.nextDouble();

	}

	@Override
	public String toString() {
		return "Fruit [color=" + color + ", weight=" + weight + ", name=" + name + ", isFresh=" + isFresh + "]";
	}

	public abstract String taste();

}
