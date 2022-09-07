package com.java.collection;

import java.util.ArrayList;
import java.util.Collections;

//Creating a test class to sort the elements
public class ComparableDemo {

	public static void main(String args[]) {
		ArrayList<ComparableStudent> al = new ArrayList<ComparableStudent>();
		al.add(new ComparableStudent(101, "Vijay", 23));
		al.add(new ComparableStudent(106, "Ajay", 27));
		al.add(new ComparableStudent(105, "Jai", 21));
		al.add(new ComparableStudent(103, "Abdul", 20));

		Collections.sort(al); // list of the students stored in al arraylist
		for (ComparableStudent st : al) { //for-each loop
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}
}