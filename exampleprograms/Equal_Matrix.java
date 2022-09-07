package com.java.exampleprograms;

public class Equal_Matrix {
	public static void main(String[] args) {
		int row1, col1, row2, col2;
		boolean flag = true;

		// Initialize matrix a
		int a[][] = { { 1, 2, 3 }, { 8, 6, 9 }, { 5, 7, 8 } };

		// Initialize matrix b
		int b[][] = { { 1, 3, 3 }, { 8, 3, 6 }, { 4, 6, 7 } };

		// Calculates the number of rows and columns present in the first matrix
		row1 = a.length;
		col1 = a[0].length;

		// Calculates the number of rows and columns present in the second matrix
		row2 = b.length;
		col2 = b[0].length;

		// Checks if dimensions of both the matrices are equal
		if (row1 != row2 || col1 != col2) {
			System.out.println("Matrices are not equal");
		} else {
			for (int i = 0; i < row1; i++) {
				for (int j = 0; j < col1; j++) {
					if (a[i][j] != b[i][j]) {
						flag = false;
						break;
					}
				}
			}

			if (flag)
				System.out.println("Matrices are equal");
			else
				System.out.println("Matrices are not equal");
		}
	}
}