package com.java.oops;

public class MethodOverloading {

	/*
	 * method overloading means providing two separate methods in a class with the
	 * same name but different arguments, while the method return type may or may
	 * not be different, which allows us to reuse the same method name.
	 * 
	 * Rules: 
	 * multiple methods with same name and with different parameters.
	 * different return types. 
	 * different access modifiers.
	 * throws different checked or unchecked exceptions.
	 */

	// method name is "display"
	private static void display(int a) {
		System.out.println("Arguments for a : " + a);
	}

	public static void display(int a, int b) {
		System.out.println("Arguments for a and b : " + a + " and " + b);
	}

	// this "display1" method accepts int
	static void display1(int x) {
		System.out.println("Got Integer data.");
	}

	// this "display1" method accepts String object
	private static void display1(String x) {
		System.out.println("Got String object.");
	}

	public static void main(String[] args) {
		display(1);
		display(2, 3);
		/*
		 * both overloaded methods accept one argument/parameter. However, one accepts the
		 * argument of type int whereas other accepts String object.
		 */
		display1(6);
		display1(7);
		display1("Abdul");

	}
}
