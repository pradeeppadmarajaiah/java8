package com.bitiknow.java8.interfaceJ8;

public interface Interface2 {

	void add(int a, int b);

	default void print(String input) {
		System.out.println("Hello Interface2" + input);
	}

	default void print1(String input) {
		System.out.println("Hello Interface2 : " + input);
	}

}
