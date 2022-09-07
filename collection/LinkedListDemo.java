package com.java.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	/*
	 * LinkedList implements the List interface.
	 * it uses a doubly linked list internally to store the elements.
	 * it can store duplicate elements.
	 * it maintain the insertion order.
	 * it is not synchronized.
	 * manipulation is fast because no shifting is required.
	 * 
	 */
	
	public static void main(String[] args) {
		LinkedList<String> a = new LinkedList<String>(); // creating LinkedList
		a.add("Abdul");
		a.add("Azad");
		a.add("Ansari");
		a.add("Wahid");
		a.add("Ahad");

		System.out.println(a);
		System.out.println(a.get(3));

		Iterator<String> itr = a.iterator();
		while (itr.hasNext()) {
		System.out.println(itr.next());
		}
	}
}