package com.bitiknow.model;

public class Dish {
	private  String name;
	private  boolean vegetarian;
	private  int calories;
	private  Type type;

	public Dish(String name, boolean vegetarian, int calories, Type type) {
		this.name = name;
		this.vegetarian = vegetarian;
		this.calories = calories;
		this.type = type;
	}

	/**
	 * @return the name
	 */
	public final String getName() {
		return name;
	}

	/**
	 * @return the vegetarian
	 */
	public final boolean isVegetarian() {
		return vegetarian;
	}

	/**
	 * @return the calories
	 */
	public final int getCalories() {
		return calories;
	}

	/**
	 * @return the type
	 */
	public final Type getType() {
		return type;
	}

	public String toString() {
		return name;
	}

	public enum Type {
		MEAT, FISH, OTHER
	}
}
