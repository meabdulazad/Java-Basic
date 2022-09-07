package com.java.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDemo {
	public static void main(String args[]) {
		// Creating a list of students
		ArrayList<ComparatorStudent> al = new ArrayList<>();
		al.add(new ComparatorStudent(101, "Vijay", 23));
		al.add(new ComparatorStudent(106, "Ajay", 27));
		al.add(new ComparatorStudent(105, "Jai", 21));
		al.add(new ComparatorStudent(103, "Abdul", 19));
		al.add(new ComparatorStudent(100, "Azad", 25));

		System.out.println("Sorting by Roll No: ");
		// Using ComparatorRollNo to sort the elements
		Collections.sort(al, new ComaparatorRollNo());
		// Traversing the list again
		for (ComparatorStudent st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
		System.out.println();
		System.out.println("Sorting by Name: ");
		// Using ComparatorName to sort the elements
		Collections.sort(al, new ComparatorName());
		// Traversing the elements of list
		for (ComparatorStudent st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
		System.out.println();
		System.out.println("Sorting by Age: ");
		// Using ComparatorAge to sort the elements
		Collections.sort(al, new ComparatorAge());
		// Traversing the list again
		for (ComparatorStudent st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}
}