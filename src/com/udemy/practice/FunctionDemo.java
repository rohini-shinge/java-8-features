package com.udemy.practice;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {

		String[] names = { "Rohini", "Avani", "Anmol", "Apeksha", "Anita" };

		Function<String, Integer> giveLength = s -> s.length();
		for (String name : names) {
			System.out.println(name + ":" + giveLength.apply(name));
		}

	}

}
