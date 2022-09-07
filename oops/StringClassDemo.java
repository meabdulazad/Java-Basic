package com.java.oops;

public class StringClassDemo {

	public static void main(String... args) {
		String s2 = "Sachin";
		System.out.println(s2); // s2 has value Sachin.
		System.out.println(s2.length());
		System.out.println(s2.hashCode());
		System.out.println("------------------------");

		s2 = s2.concat(" Tendulkar"); // using concat() method adds the string at the end.
		System.out.println(s2); // s2 has now value Sachin Tendulkar.

		System.out.println(s2.lastIndexOf(s2));
		System.out.println(s2.endsWith(s2));
		System.out.println(s2.length());
		System.out.println(s2.concat(" " + s2));
		System.out.println(s2.hashCode());
	}
}