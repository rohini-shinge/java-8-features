package com.udemy.practice;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {

		String[] names = { "Rohini", "Avani", "Anmol", "Apeksha", "Anita" };

		Predicate<String> startWithA = s -> s.charAt(0) == 'A';
		for (String name : names) {
			if (startWithA.test(name))
				System.out.println(name);
		}

	}

}
