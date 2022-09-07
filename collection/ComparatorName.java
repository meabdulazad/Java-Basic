package com.java.collection;

import java.util.Comparator;

public class ComparatorName implements Comparator<ComparatorStudent> {
	public int compare(ComparatorStudent s1, ComparatorStudent s2) {
		return s1.name.compareTo(s2.name);
	}
}