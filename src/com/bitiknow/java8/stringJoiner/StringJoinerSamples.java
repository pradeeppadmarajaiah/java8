package com.bitiknow.java8.stringJoiner;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringJoinerSamples {

	public static void main(String[] args) {

		// , is the seperator
		StringJoiner joiner = new StringJoiner(",");
		joiner.add("Java").add("Python").add("R");
		System.out.println(joiner);

		// Adding suffix and prefix
		joiner = new StringJoiner(",", "Technologies[", "]");
		joiner.add("Java").add("Python").add("R");
		System.out.println(joiner);

		// Join in String
		String join = String.join(",", "Java", "Python", "R");
		System.out.println(join);

		// List to string joiner
		List<String> list = Arrays.asList("Java", "Python", "R");
		join = String.join(",", list);
		System.out.println(join);
		
		//using Streams
		join = list.stream().map(x ->x).collect(Collectors.joining(" $ "));
		System.out.println(join);
		
		
	}

}
