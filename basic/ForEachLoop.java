package com.java.basic;

public class ForEachLoop {

	/*
	 * it is used to iterate through elements of arrays and collections.
	 * it is also known as enhanced for loop.
	 * syntax: for(dataType variable : array/collection){statements...}
	 */
	
	public static void main(String[] args) {

		int[] num = { 2, 5, 4, 7, 9 }; // creating an array
		for (int numbers : num) { // for-each loop
			System.out.println(numbers);

		}
		System.out.println();

		String[] str = { "a", "b", "d", "u", "l" }; // creating an array
		for (String alphabets : str) { // for-each loop
			System.out.println(alphabets);
		}
	}
}
