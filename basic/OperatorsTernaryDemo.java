package com.java.basic;

public class OperatorsTernaryDemo {

	public static void main(String[] args) {
		int a = 30, b = 10, c = 25, result;
		// result holds max of three numbers
		result = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);
		System.out.println("Max of three numbers = " + result);
	}
}