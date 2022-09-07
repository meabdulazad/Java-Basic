package com.java.classes;

public class ImmutableDemo {

	/*
	 * All wrapper classes and String class is immutable.
	 * Using Private and final keyword.
	 * Don't expose setter methods.
	 * must always return a new instance of the class when exposing methods.
	 *  
	 * Rules: (to create an immutable object)
	 	* Don't use setter methods.
	 	* Use Final keyword and Private access specifier.
	 	* Don't allow subclasses to override methods.
	 	* If a mutable object passed to the constructor, must be assigned to a field create a defensive copy of it.. using clone methods.
	 *
	 */
	
	public static void main(String ar[]) {
		ImmutableStudent id = new ImmutableStudent("AA0123", null); // creating new objects and 
		ImmutableStudent sn = new ImmutableStudent("Abdul", null); // null is used to match ImmutableStudent method String, String
		
		String s1 = id.getIdNumber(); // no setMethods as cannot change the value of instance variable
		String s2 = sn.getIdNumber();
		
		System.out.println("Student Name: " + s2);
		System.out.println("Id Number: " + s1);
	}
}
