package com.app.fruits;

public class Apple extends Fruit {

	public Apple() {
		super("Apple");
	}

	@Override
	public String taste() {
		return "sweet n sour";
	}

}
