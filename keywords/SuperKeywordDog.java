package com.java.keywords;

class SuperKeywordDog extends SuperKeywordAnimal {
	String color = "black";

	void printColor() {
		System.out.println(color);			// prints color of Dog class
		System.out.println(super.color);	// prints color of Animal class
		System.out.println(color);			// prints color of Dog class
	}
}
