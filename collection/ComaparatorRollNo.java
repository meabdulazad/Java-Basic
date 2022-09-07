package com.java.collection;

import java.util.Comparator;

public class ComaparatorRollNo implements Comparator<ComparatorStudent> {
	public int compare(ComparatorStudent s1, ComparatorStudent s2) {
		if (s1.rollno == s2.rollno)
			return 0;
		else if (s1.rollno > s2.rollno)
			return 1;
		else
			return -1;
	}
}