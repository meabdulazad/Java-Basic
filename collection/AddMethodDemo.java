package com.java.collection;

import java.util.*;

public class AddMethodDemo {
	public static void main(String args[]) {

		// creating an empty LinkedList
		Collection<String> li = new LinkedList<String>();

		// use add() method to add elements in the list
		li.add("Abdul");
		li.add("Azad");
		li.add("Ansari");

		// Output the present list
		System.out.println("The list is: " + li);

		// Adding new elements to the end
		li.add("Java");
		li.add("add(Object) method");

		// printing the new list
		System.out.println("The new List is: " + li);
	}
}