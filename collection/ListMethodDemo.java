package com.java.collection;

import java.util.*;

public class ListMethodDemo {

	public static void main(String[] args) {
			
	// Creating an object of List interface
    // implemented by the ArrayList class
   List<Integer> l1 = new ArrayList<Integer>();

   // Adding elements to object of List interface
   // Custom inputs

   l1.add(0, 1);
   l1.add(1, 2);

   // Print the elements inside the object
   System.out.println("Elements in 11: " +l1);

   // Now creating another object of the List 
   // interface implemented ArrayList class
   // Declaring object of integer type
   List<Integer> l2 = new ArrayList<Integer>();

   // Again adding elements to object of List interface
   // Custom inputs
   l2.add(3);
   l2.add(4);
   l2.add(5);
   System.out.println("Elements from 12 added to 11: [3, 4, 5] "+"\n"+"\t"+"this is for understanding purpose only as no elements will be arrayed in 12."+"\n"); // just to understand easily
   
   // Will add list l2 from 2 index
   l1.addAll(2, l2);
   System.out.println("Adding elements from 12 in 11: "+l1);

   // Removes element from index 1
   l1.remove(1);
   // Printing the updated List 1
   System.out.println("After removing element at index 1 from 11: "+l1+"\n");

   // Prints element at index 3 in list 1
   // using get() method
   System.out.println("Element at index 3: "+l1.get(2));

   // Replace 0th element with 6 in List 1
   l1.set(0, 6);

   // Again printing the updated List 1
   System.out.println("Replacing element at index 0 with 6 in 11: "+l1);
}
}
