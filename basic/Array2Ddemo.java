package com.java.basic;

import java.io.*;

class Array2Ddemo {

	/*
	 * Java program to print the elements of a 2-D array or matrix
	 */
	public static void print2D(int mat[][]) {
		// Loop through all rows
		for (int i = 0; i < mat.length; i++) {

			// Loop through all elements of current row
			for (int j = 0; j < mat[i].length; j++)
				System.out.print(mat[i][j] + " ");

			System.out.println();
		}
	}

	public static void main(String args[]) throws IOException {
		int mat[][] = { { 11, 12, 13, 14 }, { 15, 16, 17, 18 }, { 19, 20, 21, 22 } };
		print2D(mat);
	}
}