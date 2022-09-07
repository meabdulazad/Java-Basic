package com.java.collection;

import java.util.*;
import java.util.HashSet;

public class MethodsDemo {

	/*
	 * Collection is interface.
	 * Most of the collection methods can throw UnsupportedOperationException.
	 
	 * some collection methods:
	 	* boolean add(Object obj)
	 	* boolean addAll(Collection c)
	 	* void clear()
	 	* boolean contains(Object obj)
	 	* boolean containsAll(Collection c)
	 	* boolean equals(Object obj)
	 	* int hashCode()
	 	* boolean isEmpty()
	 	* Iterator iterator()
	 	* boolean remove(Object obj)
	 	* boolean removeAll(Collection c)
	 	* boolean retainAll(Collection c)
	 	* int size()
	 	* Object[] toArray()
	 	* Object[] toArray(Object array[])
	 	*  
	 */

	public static void main(String[] args) {
		
	// HashSet
    Set<String> s1 = new HashSet<>(); 
    s1.add("Zara");
    s1.add("Mahnaz");
    s1.add("Ayan");
    s1.add("Daisy");
    System.out.println("Set Elements:");
    System.out.print("\t" + s1+"\n"+"\n"); //using \t for tab

    // HashMap
    Map<String, String> m1 = new HashMap<String, String>(); 
    m1.put("Zara", "8");
    m1.put("Mahnaz", "31");
    m1.put("Ayan", "12");
    m1.put("Daisy", "14");
    System.out.println("Map Elements:");
    System.out.print("\t" + m1+"\n"+"\n");
    
    // remove object
    s1.remove("Zara");
    s1.remove("Ayan");
    System.out.println("Final Set Elements:");
    System.out.print("\t"+s1+"\n"+"\n");
    
	}
}