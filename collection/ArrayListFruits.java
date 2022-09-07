package com.java.collection;

import java.util.*;

public class ArrayListFruits {

	public static void main(String[] args) {

		List<String> fruits = new ArrayList<>();

		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Grapes");
		fruits.add("Pineapple");

		// printing all fruits
		System.out.println("Added fruits name:" +fruits);

		// checking the array list size
		System.out.println("Checking how many fruits name: "+fruits.size()+"\n");

		// printing fruits at index 3
		System.out.println("Checking fruits name at index 3: "+fruits.get(3));

		// replacing fruit grapes with cherry
		fruits.set(3, "Cherry");
		System.out.println("Replacing fruits grapes with cherry: "+fruits+"\n");

		// sorting the fruits name
		Collections.sort(fruits);
		System.out.println("Sorting fruits alphabetically: "+fruits);

		// removing fruit apple
		fruits.remove(1);
		System.out.println("removing fruit at index 1: "+fruits+"\n");
		
		// using for-each loop
		for(String i:fruits) {
			System.out.println(i);
		} System.out.println();

		// clearing the list of fruits
		fruits.clear();
		System.out.println("Clearing all fruits name: "+fruits);
	}
}