package com.java.collection;

import java.util.Comparator;

public class ComparatorAge implements Comparator<ComparatorStudent> {
	public int compare(ComparatorStudent s1, ComparatorStudent s2) {
		if (s1.age == s2.age)
			return 0;
		else if (s1.age > s2.age)
			return 1;
		else
			return -1;
	}
}