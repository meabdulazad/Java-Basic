package com.java.oops;

public class ConstructorOverloading {

	/* Constructor overloading: multiple constructors with same class name and with
 		different parameters */

	public ConstructorOverloading() {
		System.out.println("Constructor with no aurgument");

	}

	public ConstructorOverloading(int a) {
		System.out.println("Constructor with aurgument");
	}

	public static void main(String... args) {
		int x = 10;
		ConstructorOverloading cd = new ConstructorOverloading(x);
		System.out.println(cd.hashCode()); // using hashcode to get its location

	}

}
