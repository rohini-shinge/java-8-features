package com.udemy.practice;

import java.util.function.BiConsumer;

public class BiConsumerDemo {

	public static void main(String[] args) {
		BiConsumer<String, String> c = (str1, str2) -> System.out.println(str1 + " " + str2);
		c.accept("Avani", "Shinge");
	}

}
