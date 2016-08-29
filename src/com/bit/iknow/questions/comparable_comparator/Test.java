package com.bit.iknow.questions.comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		list.add(new Person(2, "Pradeep"));
		list.add(new Person(3, "Chandan"));
		list.add(new Person(1, "Raj"));
		System.out.println(list);

		Collections.sort(list);
		System.out.println(list);

		Collections.sort(list, new PersonCByName());
		System.out.println(list);

	}

}
