package com.java.collection;

import java.util.*;

public class ListMethods {

	/*
	 * list is interface.
	 * it stores ordered collection.
	 * it is a child interface of collection.
	 * duplicate values can be stored.
	 * it maintains insertion order.
	 * it allows positional access.
	 * it allows insertion of elements.
	 * 
	 */
		
	public static void main(String[] args) {
		
		// remove all
		// creating an empty array list
		List<String> color_list = new ArrayList<String>();

		// using add() method to add values in the list
		color_list.add("White");
		color_list.add("Black");
		color_list.add("Red");
		color_list.add("Blue");
		color_list.add("Orange");
		System.out.println("Color_List: " + color_list);
		
		// creating an empty array sample with an initial capacity
		List<String> sample_list = new ArrayList<String>();

		// using add() method to add values in the list
		sample_list.add("Green");
		sample_list.add("Red");
		sample_list.add("White");
		sample_list.add("Purple");
		sample_list.add("Pink");
		System.out.println("Sample_List: " + sample_list+"\n");
		
		//removing specific elements from sample_list 
		sample_list.remove("Pink");
		System.out.println("After removing specific color from sample_list:" +sample_list+"\n");
		
		// removing all elements from sample_list if it exists in color_list
		sample_list.removeAll(color_list);
		System.out.println("After removing colors that present in color_list from sample_List: " + sample_list);
		
		// remove sample_list
		sample_list.removeAll(sample_list);
		System.out.println("After removal of all colors from sample_list: " +sample_list);
	  }
}
