package com.java.oops;

public class OverridingAnimal {

	// overridden method
	public void display() {
		System.out.println("An animal");
	}
}

class Dog extends OverridingAnimal {

	// overriding method
	@Override
	public void display() {
		System.out.println("A dog");
	}

	public void printMessage() {

		// this calls overriding method
		display();

		// this calls overridden method
		super.display();
	}
}

class Main {
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.printMessage();
	}

}