//Invoking Lambda Expressions using without functional interface
package com.udemy.practice;

interface TestInterface1 {
	public void printHello();
}

class Demo implements TestInterface1 {

	@Override
	public void printHello() {
		System.out.println("Hello Java 8!");
	}
}

public class WithoutFunctionalInterface {

	public static void main(String[] args) {
		TestInterface1 testInterface1 = new Demo();
		testInterface1.printHello();
	}
}
