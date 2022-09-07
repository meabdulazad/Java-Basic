package com.java.oops;

public class Rectangle {

	private int x, y;
	private int width, height;

	public Rectangle() { // constructor without parameter (default)
		this(0, 0, 1, 1);
	}

	public Rectangle(int width, int height) { // constructor with parameters (parameterized)
		this(0, 0, width, height);

		// constructor overloading
	}

	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public void m1() {
		System.out.println(this.x);
		System.out.println(this.y);
		System.out.println(this.width);
		System.out.println(this.height);
	}

}
