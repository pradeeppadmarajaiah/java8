package com.bitiknow.java8.streams.flatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.omg.Messaging.SyncScopeHelper;

/**
 * 
 * @author PradeepPadmarajaiah
 *
 *         Flat map samples
 */
public class FlatMapSamples {
	public static void main(String[] args) {

		List<String> name1 = Arrays.asList("Pradeep", "Raj", "Kumar");
		List<String> name2 = Arrays.asList("Praveen", "Rama", "Karthik");
		List<String> name3 = Arrays.asList("Prakash", "Raja", "Karthik", "Kumar", "kushal");

		List<List<String>> names = new ArrayList<>();
		names.add(name1);
		names.add(name2);
		names.add(name3);
		System.out.println("Using  map");
		names.stream().map(a -> {
			List<String> temp = a.stream().filter(x -> x.startsWith("P")).collect(Collectors.toList());
			return temp;
		}).forEach(a -> System.out.print(a));

		System.out.println("\nUsing flat map");
		names.stream().flatMap(a -> a.stream()).filter(a -> a.startsWith("P")).forEach(a -> System.out.print(a));
	}

}
