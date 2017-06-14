package com.bitiknow.java8.optional;

import java.util.Optional;

public class OptionalTest {
	static String name;

	public static void main(String[] args) {

		// Optional<String> optionalNam = Optional.of(name);
		// Throws null pointer exception. Try to use "ofNullable" method
		// System.out.println(optionalNam.get());

		Optional<String> optionalName = Optional.ofNullable(name);
		// Will not throw expection. If it is not present, else part will be
		// executed
		if (optionalName.isPresent()) {
			System.out.println(optionalName.get());
		} else {
			System.out.println("Name is empty");
		}

		// Assign default value if not present.
		name = optionalName.orElse("P");

		System.out.println(name);

		name = "Pradeep";

		optionalName = Optional.ofNullable(name);
		if (optionalName.isPresent()) {
			System.out.println(optionalName.get());
		} else {
			System.out.println("Name is empty");
		}

		String name = "Deep";
		Optional<String> n = Optional.ofNullable(name);
		OptionalTest optionalTest = new OptionalTest();
		System.out.println(optionalTest.getname(n));

	}

	public String getname(Optional<String> name) {

		return name.orElse("default");

	}

}
