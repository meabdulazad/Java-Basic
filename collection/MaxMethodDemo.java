package com.java.collection;

import java.util.*;

public class MaxMethodDemo {

	public static void main(String[] argv) throws Exception {

		try {
			// creating object of LinkedList
			List<Integer> list = new LinkedList<Integer>();

			// Adding elements to Vector v
			list.add(-1);
			list.add(4);
			list.add(5);
			list.add(-11);

			// printing the max value
			// using max() method
			System.out.println("Max value is: " + Collections.max(list));
		}
			// using catch block to catch if any exception occurs as below.
		catch (ClassCastException e) {
			System.out.println("Exception thrown : " + e);
		}
		catch (NoSuchElementException e) {
			System.out.println("Exception thrown : " + e);
		}
	}
}