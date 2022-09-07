package com.java.exampleprograms;

public class DaimondStarPatternNestedForLoop {

	public static void main(String[] args) {
		
		int row = 5,column = 1, space = row/2; 			// number of spaces = 5
	        for (int a = 1; a <= row; a++) { 			// for number of rows i.e n rows
	            for (int b = space; b >= 1; b--) { 		// for number of spaces i.e 3,2,1,0,1,2,3 and so on
	                System.out.print(" ");
	            }
	            for (int c = 1; c <= column; c++) { 	// for number of columns i.e 1,3,5,7,5,3,1
	                System.out.print("*");
	            }
	            System.out.println();
	            if (a < row/2+1) {
	            	column += 2; 						// columns increasing till center row 
	                space -= 1; 						// spaces decreasing till center row 
	            } else {
	            	column -= 2; 						// columns decreasing
	                space += 1; 						// spaces increasing

	            }
	        }
	    }
}
