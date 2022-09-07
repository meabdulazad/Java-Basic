package com.java.oops;

public class MethodOverloadingDemo2 {

	// changing number of arguments and data types as well
	static int add(int a, int b) {
		return a + b;
	}

	static double add(double a, double b) {
		return a + b;
	}
	static double add(int a, double b, long c) {
		return a + b-c;
	}
	static String add(String a, String b, String c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		System.out.println(add(10, 10));
		System.out.println(add(12.4, 12.6));
		System.out.println(add(10, 10.5, 15));
		System.out.println(add("Abdul ", "Azad ", "Ansari"));
	}
}