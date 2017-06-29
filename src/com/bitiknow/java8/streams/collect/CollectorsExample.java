package com.bitiknow.java8.streams.collect;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Collect example in java 8
 * 
 * @author PradeepPadmarajaiah
 *
 */
public class CollectorsExample {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Pradeep", "pradeep", "PRADEEP", "pradeep", "pradeep", "PRaDEEP", "Pradeep",
				"Pradeep", "pradeep", "PRADEEP", "pradeep", "pradeep", "PRADEEP", "Pradeep");

		System.out.println("Original List of names : " + names);

		// Get the unique names
		Set<String> uniqueNames = names.stream().collect(Collectors.toSet());
		System.out.println("unique names via Set : " + uniqueNames);

		// Get the unique names and make it to upper case
		List<String> uppercaseUniqueName = names.stream().map(x -> x.toUpperCase()).distinct()
				.collect(Collectors.toList());
		System.out.println("unique names via list making upper case : " + uppercaseUniqueName);

		// Grouping by based on unique name and count how many times it exists.
		Map<String, Long> groupBy = names.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("Grouping By : " + groupBy);

		List<Integer> values = Arrays.asList(1, 2, 3, 34, 45, 45, 34, 23, 23, 34, 45);

		// Used for collecting statistics such as count, min, max, sum, and
		// average of stream
		IntSummaryStatistics sumStats = values.stream().collect(Collectors.summarizingInt(x -> x + x));
		System.out.println("Sum values : " + sumStats.getSum());

		// Joining the list of the strings
		String joining = uniqueNames.stream().collect(Collectors.joining(" , "));

		System.out.println("Joining Samples : " + joining);

	}

}
