package com.udemy.practice;

interface IntefaceTest {

	public void m1();

}

public class AnonymousInnerClassDemo {

	int x = 555;

	public void m2() {
		IntefaceTest interfaceTest = new IntefaceTest() {
			// AnonymousInnerClass instance variable
			int x = 777;

			@Override
			public void m1() {
				// Access inner class instance variable
				System.out.println(this.x);
				// Access outer class instance variable
				System.out.println(AnonymousInnerClassDemo.this.x);
			}
		};
		interfaceTest.m1();
	}

	public static void main(String[] args) {

		AnonymousInnerClassDemo classDemo = new AnonymousInnerClassDemo();
		classDemo.m2();
	}
}
