package com.java.basic;

public class ForLoopDemo {

	public static void main(String[] args) {
		
		// Assignment
		//       *
		//     * * *
		//    * * * * 
		//     * * *
		//       *
		
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}