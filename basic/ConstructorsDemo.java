package com.java.basic;

class ConstructorsDemo {
	
	// Constructor:a block similar to method without return type.
		// It is called when instance of class is created. 
		// When constructor is called memory for that object is allocated.
		// To create object of class we need to call constructor.
		// it is called constructor because it constructs the values at the time of object creation.
		// When you create an object default constructor will get called.
	
	// Assignment : Types of constructor
		// 2 types of constructor: Default and Parameterized
			// Default Constructor (No-arg constructor): Constructor without parameter is default constructor.
			// Parameterized Constructor: Constructor with 1 or many  parameters.

	String name;
	int id;

	public ConstructorsDemo() { // default constructor
	}

	// creating display method
	void display() {
		System.out.println("Constructor without aurguments: ");
	}

	public ConstructorsDemo(String x, int i) { // parameterized constructor
		name = x;
		id = i;
	}

	// creating display method
	void info() {
		System.out.println("Constructor with aurguments: " + id + " " + name);
	}

	public static void main(String[] args) {

		// creating objects without parameters
		ConstructorsDemo cd = new ConstructorsDemo();
		// displaying value of the object by calling method display
		cd.display();

		// creating object with parameter
		ConstructorsDemo cd1 = new ConstructorsDemo("Abdul", 111);
		// displaying value of the object by calling method info
		cd1.info();
	}
}