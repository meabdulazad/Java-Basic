package com.java.basic;

public class DataTypeConversionImplicit {

	public static void main(String[] args) {
		int i = 100;
		long l = i; // Integer to long type. Automatic type conversion.
		float f = l; // long to float type. Automatic type conversion.
		System.out.println("Integer value : " + i);
		System.out.println("Integer to long type : " + l);
		System.out.println("Long to float type : " + f);
	}
}
