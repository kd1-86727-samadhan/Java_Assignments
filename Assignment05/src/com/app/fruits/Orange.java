package com.app.fruits;

public class Orange extends Fruit {

	public Orange() {
		super("Orange");
	}

	@Override
	public String taste() {
		return "sour";
	}

}
