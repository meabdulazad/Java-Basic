package com.java.collection;

import java.util.HashSet;

class HashSetDemo {
	public static void main(String[] args) {
		// Instantiate an object of HashSet
		HashSet<String> fruit_set1 = new HashSet<>();
		HashSet<String> fruit_set2 = new HashSet<>();

		// Add elements using add method to fruit_set1
		fruit_set1.add("Apple");
		fruit_set1.add("Mango");
		fruit_set1.add("Orange");

		// Add elements using add method to fruit_set2
		fruit_set2.add("Cherry");
		fruit_set2.add("Grapes");
		fruit_set2.add("Watermelon");
		fruit_set2.add("Strawberry");

		System.out.println("fruit_set1 size: " + fruit_set1.size());
		System.out.println("fruit_set2 size: " + fruit_set2.size());

		System.out.println("fruit_set1 elements: " + fruit_set1);
		System.out.println("fruit_set2 elements: " + fruit_set2);

		// removing a fruit from fruit_set2
		fruit_set2.remove("Grapes");

		System.out.println("fruit_set2 elements after removing a fruit: " + fruit_set2);

		// checking a fruit exits in the fruit_set1 and 2
		System.out.println(fruit_set1.contains("Orange"));
		System.out.println(fruit_set2.contains("Orange"));
	}
}