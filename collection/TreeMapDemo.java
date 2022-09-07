package com.java.collection;

import java.util.*;

/*
 * Mapping is between a key and a value, always in a pair.
 * Map contains unique keys.
 * It is useful for searching, updating, or deleting elements on the basis of key.
 * 2 Interfaces:
 		* Map
 		* SortedMap
 * 3 Classes:
 		* HashMap:
 				* Never maintain track and order of insertion.
 				* It allows a null key and multiple null values.
 		* LinkedHashMap:
 				* Maintain track and order of insertion.
 				* It allows a null key and multiple null values.
 		* TreeMap: 
 				* It is a red-black tree-based implementation.
 				* It does not allow null keys, however, allows multiple null values.
 				* It throws NullPointerException if null key is inserted.
 				* It maintains ascending order.
 				* 
 */

public class TreeMapDemo {
	public static void main(String args[]) {
		TreeMap<Integer, String> map1 = new TreeMap<>();
		map1.put(100, "Amit");
		map1.put(102, "Ravi");
		map1.put(101, "Vijay");
		map1.put(103, "Rahul");

		for (Map.Entry<Integer, String> m : map1.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		System.out.println();
		try {
			NavigableMap<Integer, String> map2 = new TreeMap<Integer, String>();
			map2.put(1001, "Amul");
			map2.put(1002, "Nanak");
			map2.put(1004, "Swad");
			map2.put(1006, null);
			map2.put(1003, "Shan");
			map2.put(1007, null);
			map2.put(1005, "Parle");
			//	map2.put(null, "NullKey"); // TreeMap does not allow null key so this throws NullPointerException so will not invoke after this.

			// Maintains ascending order
			System.out.println("ascendingMap: " + map2);

			// Maintains descending order
			System.out.println("descendingMap: " + map2.descendingMap());

			// Returns key-value pairs whose keys are less than or equal to the specified key.
			System.out.println("\nheadMap: " + map2.headMap(1002, true));

			// Returns key-value pairs whose keys are greater than or equal to the specified key.
			System.out.println("tailMap: " + map2.tailMap(1002, true));

			// Returns key-value pairs exists in between the specified key.
			System.out.println("\nsubMap: " + map2.subMap(1001, false, 1005, true));
			
		} catch (NullPointerException npe) {
			System.out.println(npe);
		}
	}
}