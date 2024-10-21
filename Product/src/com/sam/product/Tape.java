package com.sam.product;

import java.util.Scanner;

public class Tape extends Product {
	private String artist;

	public Tape() {
		// TODO Auto-generated constructor stub
	}

	public Tape(int pId, String title, double price, String artist) {
		super(pId, title, price);
		this.artist = artist;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Artist: ");
		artist = sc.next();
	}

	public void dislay() {
		super.dislay();
		System.out.println("Artist: " + artist);
	}

}
