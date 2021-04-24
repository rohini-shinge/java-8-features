package com.udemy.practice;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {

		String[] names = { "Rohini", "Avani", "Anmol", "Apeksha", "Anita" };

		Consumer<String> startWithA = s -> System.out.println(s);
		for (String name : names) {
			startWithA.accept(name);
		}

	}

}
