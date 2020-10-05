//Invoking Lambda Expressions using with functional interface
package com.udemy.practice;

@FunctionalInterface
interface TestInterface2 {
	public void printHello();
}

public class WithFunctionalInterface1 {

	public static void main(String[] args) {
		TestInterface2 testInterface2 = () -> System.out.println("Hello Java 8!");
		testInterface2.printHello();
	}
}
