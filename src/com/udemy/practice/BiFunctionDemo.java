package com.udemy.practice;

import java.util.function.BiFunction;

public class BiFunctionDemo {

	public static void main(String[] args) {

		BiFunction<Integer, Integer, Integer> f = (a, b) -> a * b;
		System.out.println(f.apply(5, 5));

	}

}
