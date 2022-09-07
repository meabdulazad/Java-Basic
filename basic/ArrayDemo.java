package com.java.basic;

/*
 * An array is a container object that holds a fixed number of values of liked-type.
 * Arrays are dynamically allocated (array type must be declared and must allocate memory to hold the array using new assigning to array variable).
 * are stores in contagious memory.
 * are in order and each has an index starting from 0.
 * can be used as static field, a local variable, or a method parameter.
 * size of array must be specified by int or short value (not long).
 * direct superclass of an array type is Object.
 * supports random access.
 * size of array can not be altered once initialized.
*/

public class ArrayDemo {

	public int roll_no;
	public String name;

	ArrayDemo(int roll_no, String name) {
		this.roll_no = roll_no;
		this.name = name;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, 6, 8, 4, 9 };
		System.out.println("Printing the memory allocated location: " + arr);
		System.out.println("Element at index 6 :" + arr[6]);
		System.out.println("Element at index 2 :" + arr[2] + "\n");

		try {
			// declares an Array of integers.

			ArrayDemo[] arr1;

			// allocating memory for 5 objects of type ArrayDemo (Student).
			arr1 = new ArrayDemo[5];

			// initialize the first elements of the array
			arr1[0] = new ArrayDemo(1, "aman");

			// initialize the second elements of the array
			arr1[1] = new ArrayDemo(2, "vaibhav");

			// so on...
			arr1[2] = new ArrayDemo(3, "shikar");
			arr1[3] = new ArrayDemo(4, "dharmesh");
			arr1[4] = new ArrayDemo(5, "mohit");

			// accessing the elements of the specified array
			for (int i = 0; i < arr1.length; i++)
				System.out.println("Element at " + i + " : " + arr1[i].roll_no + " " + arr1[i].name);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}
}
