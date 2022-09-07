package com.java.oops;

class MethodOverloadingDemo1 {
	
	// changing number of arguments of same data type
	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b - c;
	}
	static float add(float a, int b, float c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		System.out.println(add(5, 5));
		System.out.println(add(5, 5, 5));
		System.out.println(add(5.7f, 5, 10.3f));
	}
}