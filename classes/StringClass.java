package com.java.classes;

public class StringClass {

	/*
	 * String class is immutable because of the security, synchronization and concurrency, caching, and class loading
	 * and so that no one can extend the class.
	 * 
	 * Rules: (to create an immutable object)
	 * Don't use setter methods.
	 * Use Final keyword and Private access specifier.
	 * Don't allow subclasses to override methods.
	 * If a mutable object passed to the constructor, must be assigned to a field create a defensive copy of it.. using clone methods.
	 */

	public static void main(String args[]) {
		String s1 = "Sachin";
		s1.concat(" Tendulkar");	// concat() method appends the string at the end.
		System.out.println(s1);		// will print Sachin (not Sachin Tendulkar) because strings are immutable objects.
	
		System.out.println(s1.length());
		System.out.println(s1.charAt(1));
		System.out.println(s1.hashCode());
		System.out.println(s1.concat(" "+s1));
	} 

}