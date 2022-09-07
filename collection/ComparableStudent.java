package com.java.collection;

class ComparableStudent implements Comparable<ComparableStudent> {
	int rollno;
	String name;
	int age;

	ComparableStudent(int rollno, String name, int age) { // creating constructor
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public int compareTo(ComparableStudent st) { // creating comparable method
		if (age == st.age)
			return 0;
		else if (age > st.age)
			return 1;
		else
			return -1;
	}
}