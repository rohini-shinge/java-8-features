package com.udemy.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo1 {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(45);
		numbers.add(40);
		numbers.add(0);
		numbers.add(58);
		numbers.add(43);

		// Filtering Mechanism/collect() method
		List<Integer> evenNumbers = numbers.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(evenNumbers);
		System.out.println("************************");

		// Mapping Mechanism/collect() method
		List<Integer> doubleit = numbers.stream().map(i -> i + i).collect(Collectors.toList());
		System.out.println(doubleit);
		System.out.println("************************");

		// count() method
		List<String> names = new ArrayList<>();
		names.add("Avani S.");
		names.add("Gautam T.");
		names.add("Omi J.");
		names.add("Dhaval P.");
		names.add("Nikita S.");

		Long gNameCount = names.stream().filter(s -> s.charAt(0) == 'G').count();
		System.out.println(gNameCount);
		System.out.println("************************");

		// sorted() Method
		List<Integer> sortedList = numbers.stream().sorted().collect(Collectors.toList());
		System.out.println("Natural Sorting:" + sortedList);
		List<Integer> customeizedSortedList = numbers.stream().sorted((i1, i2) -> -i1.compareTo(i2))
				.collect(Collectors.toList());
		System.out.println("Customeized Sorting:" + customeizedSortedList);
		// min() and max() Methods
		System.out.println("************************");

		System.out.println("Min: " + numbers.stream().min((i1, i2) -> i1.compareTo(i2)).get());
		System.out.println("Max:" + numbers.stream().max((i1, i2) -> i1.compareTo(i2)).get());
		System.out.println("************************");

		// forEach() Method

		names.stream().forEach(s -> System.out.println(s));
		System.out.println("************************");
		// By method reference
		names.stream().forEach(System.out::println);
		System.out.println("************************");

		// toArray() Method
		Integer[] arrayInt = numbers.stream().toArray(Integer[]::new);
		for (Integer integer : arrayInt) {
			System.out.println(integer);

		}
		System.out.println("************************");

		// Stream.of() Method
		Stream<Integer> s = Stream.of(234, 3345, 456, 45, 456, 456);
		s.forEach(i -> System.out.println(i));

	}

}
