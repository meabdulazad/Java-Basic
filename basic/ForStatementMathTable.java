package com.java.basic;

public class ForStatementMathTable {

	public static void main(String[] args) {

		/*
		 * writing table for any number, just change the values of "a" to what number
		 * you want table for like change to 17 if want table of 17.
		 */		
		
		for (int a = 13; a <= 13; a++) { // for expression (initialization, condition, increment/decrement)
			for (int b = 1; b <= 10; b++) {
				System.out.println(a * b);
			}
		}
	}
}