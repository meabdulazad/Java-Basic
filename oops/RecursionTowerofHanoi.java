package com.java.oops;

import java.util.Scanner;

public class RecursionTowerofHanoi {
	static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod) {
		if (n == 0) {
			return;
		}
		// logic to move disks from one rod to another
		towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
		System.out.println("Move disk " + n + " from rod " + from_rod + " to rod " + to_rod);
		towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
	}

	// main Driver method
	public static void main(String args[]) {
		// Number of disks
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of disks: ");
		int n = sc.nextInt();

		towerOfHanoi(n, 'A', 'C', 'B'); // A, B and C are names of rods
		sc.close();
	}
}