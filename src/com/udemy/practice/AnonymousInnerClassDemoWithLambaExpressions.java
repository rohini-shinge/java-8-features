package com.udemy.practice;

interface IntefaceTest4 {

	public void m1();
}

public class AnonymousInnerClassDemoWithLambaExpressions {

	int x = 555;

	public void m2() {
		IntefaceTest4 interfaceTest = () -> {
			int x = 777;
			// Access inner class instance variable
			// Result will 555 - In LE this. refers to outer class instance variable only
			// In LE There is only localv variable no instance variable
			System.out.println(this.x);

		};
		interfaceTest.m1();
	}

	public static void main(String[] args) {

		AnonymousInnerClassDemoWithLambaExpressions classDemo = new AnonymousInnerClassDemoWithLambaExpressions();
		classDemo.m2();

	}

}
