package com.java.basic;

public class ConstructorParametrised {

	int id;
	String name;

	// creating a parameterized constructor
	ConstructorParametrised(int i, String n) {
		id = i;
		name = n;
	}

	// method to display the values
	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String args[]) {
		
		// creating objects and passing values
		ConstructorParametrised s1 = new ConstructorParametrised(111, "Karan");
		ConstructorParametrised s2 = new ConstructorParametrised(222, "Aryan");
		
		// calling method to display the values of object
		s1.display();
		s2.display();
	}
}