package com.java.collection;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String args[]) {
		// TreeSet of String Type
		TreeSet<String> tset = new TreeSet<String>();

		// Adding elements to TreeSet<String>
		tset.add("Abdul");
		tset.add("String");
		tset.add("Test");
		tset.add("Pen");
		tset.add("Ink");
		tset.add("Jack");

		// Displaying TreeSet
		System.out.println("TreeSet elemetns: " + tset);

		// removing an element
		tset.remove("Ink");
		System.out.println("\nRemoved an element: " + tset);

		// TreeSet of Integer Type
		TreeSet<Integer> tset2 = new TreeSet<Integer>();

		// Adding elements to TreeSet<Integer>
		tset2.add(88);
		tset2.add(7);
		tset2.add(101);
		tset2.add(0);
		tset2.add(3);
		tset2.add(222);
		System.out.println(tset2);

		// checking an element
		int cn = 101;
		int cn1 = 105;
		System.out.println("\nContains an element: " + cn + " " + tset2.contains(cn));
		System.out.println("\nContains an element: " + cn1 + " " + tset2.contains(cn1));
	}
}