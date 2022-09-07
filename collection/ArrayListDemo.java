package com.java.collection;

import java.util.*;

public class ArrayListDemo {

	/* it implements the List interface.
	 * it stores duplicate element of different data types.
	 * it maintains the insertion order.
	 * it is non-synchronized.
	 * it is randomly accessible.
	 *  
	 */
	
	public static void main(String[] args) {
		List<String> a = new ArrayList<>(); // creating ArrayList
		a.add("Abdul"); // Adding object in ArrayList
		a.add("Azad");
		a.add("Ansari");
		a.add("AbdulAzad");
		a.add("AbdulAnsari");

		System.out.println(a);
		System.out.println(a.get(2));
		try {
			String b=a.get(6); // throw exception.
			System.out.println(b+"\n");
		} catch (IndexOutOfBoundsException e) { // exception caught.
			System.out.println("IndexOutOfBoundsException.");
		} finally { // used finally block to iterate, however, without finally also iterator works.
			Iterator<String> itr=a.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
		}
	}
}