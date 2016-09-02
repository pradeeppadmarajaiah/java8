package com.bitiknow.java8.interfaceJ8;

public interface Interface1 {

	void add(int a, int b);

	default void print(String input) {
		System.out.println("Hello " + input);
	}

}
