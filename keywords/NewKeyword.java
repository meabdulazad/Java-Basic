package com.java.keywords;

public class NewKeyword { // NewKeyword is class name.

	/*
	 * new keyword used to create new object.
	 */

	int x = 3;
	String a = "Abdul";

	public static void main(String[] args) {
		NewKeyword nk1 = new NewKeyword(); // using new keyword to create a new object.
		NewKeyword nk2 = new NewKeyword();
		System.out.println(nk1.x);
		System.out.println(nk2.a);

	}
}
