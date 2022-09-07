package com.java.collection;

import java.util.Vector;

public class VectorDemo {

	/*
	 * it uses a dynamic array to store elements.
	 * similar to ArrayList.
	 * it is synchronized.
	 */
		
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("Abdul");
		v.add("Azad");
		v.add("Ansari");
		v.add("Azad1");

		System.out.println(v);
	}
}