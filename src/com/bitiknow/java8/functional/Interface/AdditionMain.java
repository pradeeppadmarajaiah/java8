package com.bitiknow.java8.functional.Interface;

public class AdditionMain {
	public static void main(String[] args) {
		Math add = (a, b) -> a + b;
		System.out.println(add.operation(2, 5));

		Math multiply = (a, b) -> a * b;
		System.out.println(multiply.operation(2, 5));
	}

}
