package com.bitiknow.lamba;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.bitiknow.model.Dish;
import com.bitiknow.model.Trader;
import com.bitiknow.model.Transaction;

public class StreamManipulation {
	private static long howManytransactions1;
	private static long howManytransactions;
	private static Comparator<Dish> dishCaloriesComparator;

	public static void main(String[] args) {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		List<Transaction> transactions = Arrays.asList(new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000), new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710), new Transaction(mario, 2012, 700), new Transaction(alan, 2012, 950));
		List<Transaction> transactions2011 = transactions.stream().filter((t) -> t.getYear() == 2011)
				.collect(Collectors.toList());
		System.out.println(transactions2011);
		List<Transaction> transactions2011Sorted = transactions.stream().filter((t) -> t.getYear() == 2011)
				.sorted(comparing(Transaction::getValue)).collect(Collectors.toList());
		System.out.println(transactions2011Sorted);

		List<String> cities = transactions.stream().map((t) -> t.getTrader().getCity()).distinct()
				.collect(Collectors.toList());
		System.out.println(cities);
		// or
		Set<String> citiesSet = transactions.stream().map(transaction -> transaction.getTrader().getCity())
				.collect(Collectors.toSet());
		System.out.println(citiesSet);

		List<Trader> traders = transactions.stream().map(Transaction::getTrader)
				.filter(t -> t.getCity().equalsIgnoreCase("Cambridge")).distinct().sorted(comparing(Trader::getName))
				.collect(toList());
		System.out.println(traders);
		String traderStr = transactions.stream().map(transaction -> transaction.getTrader().getName()).distinct()
				.sorted().collect(Collectors.joining());
		System.out.println(traderStr);
		boolean milanBased = transactions.stream()
				.anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
		System.out.println(milanBased);

		Optional<Integer> highestValue = transactions.stream().map(Transaction::getValue).reduce(Integer::max);
		System.out.println(highestValue);

		Optional<Transaction> smallestTransaction = transactions.stream().min(comparing(Transaction::getValue));
		System.out.println(smallestTransaction);

		howManytransactions = transactions.stream().collect(Collectors.counting());
		howManytransactions1 = transactions.stream().count();
		dishCaloriesComparator = Comparator.comparingInt(Dish::getCalories);

	}

}
