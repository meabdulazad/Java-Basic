package com.java.basic;

/* 
 * Non-primitive data types: Custom-defined by developer or programmer or user.
 * example: String, Array, Class
 * Array is technically neither primitive nor non-primitive as Java provide native support for string handling. 
*/
public class NonPrimitiveDataTypes {

	public static void main(String[] args) {
		String str="Abdul";
		int arr[]= {1,2,3,4,5};
		System.out.println("String: " +str);
		System.out.println("Element at index 0 in the Array: "+arr[0]);
		System.out.println("Element at index 3 in the Array: "+arr[3]);
	}
}