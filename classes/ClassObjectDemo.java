package com.java.classes;

public class ClassObjectDemo {
	// Instance Variables
	String name;
	String breed;
	int age;
	String color;

	// constructor overloading
	// Constructor Declaration of Class for dog
	public ClassObjectDemo(String name, String breed, int age, String color) {
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.color = color;
	}

	// Constructor Declaration of Class for cat
	public ClassObjectDemo(String name, String breed, String color) {
		this.name = name;
		this.breed = breed;
		this.color = color;
	}

	// method 1
	public String getName() {
		return name;
	}

	// method 2
	public String getBreed() {
		return breed;
	}

	// method 3
	public int getAge() {
		return age;
	}

	// method 4
	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		return ("\nHi my name is " + this.getName() + ".\nMy breed,age and color are " + this.getBreed() + ","
				+ this.getAge() + "," + this.getColor());
	}

	public static void main(String[] args) {
		// creating new object
		ClassObjectDemo Dog = new ClassObjectDemo("Tommy", "papillon", 5, "white");
		System.out.println(Dog.toString());

		ClassObjectDemo Cat = new ClassObjectDemo("Sneaky", "Abyssinian", "brown");
		System.out.println(Cat.toString());
	}
}