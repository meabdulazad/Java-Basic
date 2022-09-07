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
 				* It does not allow null keys, however, allows multiple null values.
 				* It maintains ascending order.
 */

public class HashMapDemo {

	public static void main(String[] args) {
		
		// HashMap() constructor
		// no need to mention Generic type twice
		HashMap<Integer, String> hm1= new HashMap<>();
		
		// initialization of HashMap using generics
		HashMap<Integer, String> hm2= new HashMap<Integer, String>();
		
		// HashMap(int initialCapacity) Constructor
		HashMap<Integer, String> hm3= new HashMap<>(3);
		
		// HashMap(int initialCapacity,float loadFactor) Constructor
		 HashMap<Integer, String> hm4= new HashMap<>(4, 0.75f);
		 
		// HashMap(Map map) Constructor
		 Map<Integer, String> hm5 = new HashMap<>();
		
		hm1.put(1,  "Abdul");
		hm1.put(2,  "Azad");
		hm1.put(3, "Ansari");
		System.out.println("Using HashMap() constructor without twice generics: "+hm1);
		System.out.println();
		
		hm2.put(1, "Apple");
		hm2.put(2, "Orange");
		hm2.put(3, "Mango");
		hm2.put(2, "Sweet Orange");
		hm2.put(5, "Mango");
		hm2.put(6, null);
		hm2.put(null, "Mango");
		System.out.println("Using HashMap() constructor with generics: "+hm2);
		System.out.println();
		
		hm2.put(2, "Strawberry");
		System.out.println("Using HashMap() constructor with generics and replacing key 2 value: "+hm2);
		System.out.println();
		
		hm3.put(1, "Blue");
		hm3.put(2, "Black");
		hm3.put(3, "Red");
		hm3.put(4,  "Pink");
		hm3.put(5, "Red");
		hm3.put(6,  "Pink");
		System.out.println("Using HashMap(int initialCapacity) Constructor: "+hm3);
		System.out.println();
		
		hm4.put(1, "Honda");
		hm4.put(2, "Toyota");
		hm4.put(3, "Hyundai");
		hm4.put(4,"Nissan");
		System.out.println("HashMap(int initialCapacity,float loadFactor) Constructor: "+hm4);
		System.out.println();
		
		hm4.remove(2);
		System.out.println("HashMap(int initialCapacity,float loadFactor) Constructor after removing element 2: "+hm4);
		System.out.println();
		
		hm5.put(1,  "One");
		hm5.put(2,  "Two");
		hm5.put(3,  "Three");
		hm5.put(4, "Four");
		System.out.println("Using HashMap(Map map) Constructor: "+hm5);
		System.out.println();
		
		//Iterate the map using for-each loop
		for(Map.Entry<Integer, String> e: hm5.entrySet())
			System.out.println("Key: "+e.getKey()+" "+"Value: "+e.getValue());
	}
}