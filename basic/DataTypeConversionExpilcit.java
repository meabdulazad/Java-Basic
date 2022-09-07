package com.java.basic;

public class DataTypeConversionExpilcit {

	public static void main(String[] args) {
		// char ch = 'b'; // declaring character variable.
		// int num = 7; // declaring integer variable.
		// ch=num; // impossible as int takes 4 bytes while character takes 2 bytes.
		double d = 100.0125456876; // declaring double data type.
		float f = (float) d; // explicit type casting, from double to float.
		long l = (long) f; // explicit type casting, from float to long.
		System.out.println("Double type : " + d);
		System.out.println("Double to float type : " + l);
		System.out.println("Float to long type : " + f);
	}
}