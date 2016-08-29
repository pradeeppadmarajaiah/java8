package com.bitiknow.java8.streams;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class StreamManipulation {

	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(12, 334, 35, 45, 2, 5, 67, 9, 10, 23, 56, 21);
		List<String> listValue = new ArrayList<>();
		listValue.add("Pradeep");
		listValue.add("Padmarajaiah");

		// Convert Stream to List.
		List<Integer> intList = stream.collect(toList());

		// Convert stream to map.
		Map<Integer, Integer> map = stream.collect(toMap(i -> i, i -> i + 5));

		// Convert stream to array.
		Integer[] array = stream.toArray(Integer[]::new);

		// filter greater than 20.
		intList = stream.filter(i -> i > 20).collect(toList());

		// Print the integer more than 50
		stream.forEach(intV -> System.out.print(intV + " "));

		// to Uppercase of list.
		listValue = listValue.stream().map(i -> i.toUpperCase()).collect(toList());

		// Sorted order in natural way.
		listValue = listValue.stream().sorted().collect(toList());

		// Sorted order using Comparator.
		listValue = listValue.stream().sorted(Comparator.reverseOrder()).collect(toList());

		// Count
		long count = stream.filter(i -> i < 10).count();

		// Add greater than 20.
		int sum = stream.filter(i -> i > 20).mapToInt(i -> i).sum();
	}

}
