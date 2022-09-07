package com.java.basic;

public class ConstructorDefaultStudent {

	int id;
	String name;

	// method to display the value of id and name
	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String args[]) {
		// creating objects
		ConstructorDefaultStudent s1 = new ConstructorDefaultStudent();
		ConstructorDefaultStudent s2 = new ConstructorDefaultStudent();
		// displaying values of the object
		s1.display();
		s2.display();
	}
}