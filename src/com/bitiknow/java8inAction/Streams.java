package com.bitiknow.java8inAction;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.bitiknow.model.Dish;
import com.bitiknow.model.Dish.Type;

public class Streams {
	public static void main(String[] args) {

		List<Dish> menu = Arrays.asList(new Dish("pork", false, 800, Dish.Type.MEAT),
				new Dish("beef", false, 700, Dish.Type.MEAT), new Dish("chicken", false, 400, Dish.Type.MEAT),
				new Dish("french fries", true, 530, Dish.Type.OTHER), new Dish("rice", true, 350, Dish.Type.OTHER),
				new Dish("season fruit", true, 120, Dish.Type.OTHER), new Dish("pizza", true, 550, Dish.Type.OTHER),
				new Dish("prawns", false, 300, Dish.Type.FISH), new Dish("salmon", false, 450, Dish.Type.FISH));

		Map<Type, List<Dish>> dishesByTypeP = menu.parallelStream().collect(groupingBy(Dish::getType));
		System.out.println(dishesByTypeP);
		Map<Type, List<Dish>> dishesByType = menu.stream().collect(groupingBy(Dish::getType));
		System.out.println(dishesByType);
		List<String> lowCaloricDishesName = menu.parallelStream().filter(d -> d.getCalories() < 400)
				.sorted(comparing(Dish::getCalories)).map(Dish::getName).collect(toList());
		System.out.println(lowCaloricDishesName);

		List<String> threeHighCaloricDishesName = menu.stream().filter((d) -> d.getCalories() > 300)
				.sorted(comparing(Dish::getName)).map(Dish::getName).limit(3).collect(toList());
		System.out.println(threeHighCaloricDishesName);
	}

}
