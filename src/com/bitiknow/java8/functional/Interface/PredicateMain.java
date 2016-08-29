package com.bitiknow.java8.functional.Interface;

import java.util.function.Predicate;

/**
 * Use Predicate to check whether is a even number or not.
 * 
 * @author pradeep
 *
 */
public class PredicateMain {
	public static void main(String[] args) {
		Predicate<Integer> checkEvenNumber = i -> {
			if (i % 2 == 0)
				return true;
			else
				return false;
		};

		boolean test = checkEvenNumber.test(5);
		if (test)
			System.out.println("Given number is  an even number");
		else
			System.out.println("Given number is not an even number");
	}

}
