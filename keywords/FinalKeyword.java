package com.java.keywords;

public class FinalKeyword {

	/*
	 * final is non-access modifier used for classes, attributes & methods.
	 * impossible to inherit or override. 
	 * also called as modifier. 
	 * useful where a variable has always same value eg pi=3.14159
	 * 
	 */

	final int x = 20;

	public static void main(String[] args) {
		FinalKeyword y = new FinalKeyword();
		// y.x=10; // generate error as final keyword not allow to assign value of x again.
		System.out.println(y.x);
	}

}
