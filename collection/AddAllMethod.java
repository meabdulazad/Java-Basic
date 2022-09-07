package com.java.collection;

import java.util.*;

public class AddAllMethod {

	public static void main(String[] argv) throws Exception {
		try {

			// creating object of List<String>
			List<String> arrlist = new ArrayList<String>();

			// using add() method
			arrlist.add("Abdul");
			arrlist.add("Azad");
			arrlist.add("Ansari");
			arrlist.add("Java");

			// printing the arrlist before operation
			System.out.println("arrlist before addAll operation : " + arrlist);

			// add the specified element to specified Collections
			// using addAll() method
			boolean b = Collections.addAll(arrlist, "for", "Beginners", "Developer");

			// printing the arrlist after operation
			System.out.println("result : " + b + "\n");
			
			List<String> arrlist1=new LinkedList<String>();
			arrlist1.add("Core");
			arrlist1.add("Java");

			// using contains() method
			arrlist1.contains("Java");
			System.out.println("Checking whether 'Java' is present in this collection: " + arrlist1 + "\n");
			
			// printing the arrlist after operation
			System.out.println("arrlist after addAll operation : " + arrlist);

			// using isEmpty() method to check whether the arrList is empty
			System.out.println("Checking the arrList is empty: " + arrlist.isEmpty());

			// using clear() method to clear all elements from the list
			arrlist.clear();
			System.out.println("After using clear method: " + arrlist);

		} catch (NullPointerException e) {
			System.out.println("Exception thrown : " + e);
		} catch (IllegalArgumentException e) {
			System.out.println("Exception thrown : " + e);
		}
	}
}