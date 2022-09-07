package com.java.keywords;

public class ThisKeyword {

	/*
	 * this keyword refers to the current object in a method or constructor.
	 * mostly used to eliminate confusion between attributes & parameters with same name.
	 * 
	 * can be used to:
	 * Invoke current class constructor.
	 * Invoke current class method.
	 * Return the current class object.
	 * Pass an argument in the method call.
	 * Pass an argument in the constructor call.
	 * 
	 */

	int a;
	String b;

	public ThisKeyword(int a, String b) { // constructor with parameters.
		this.a = a;
		this.b = b;
	}

	public static void main(String[] args) {
		ThisKeyword tk1 = new ThisKeyword(11, "AA");
		System.out.println("Value of a: " + tk1.a);
		System.out.println("Value of b: " + tk1.b);
	}
}
