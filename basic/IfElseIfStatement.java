package com.java.basic;

public class IfElseIfStatement {

	public static void main(String[] args) {

		int score = 99;
		char grade;

		// if statement

		if (score >= 90) {
			grade = 'A';
		}

		// if-else ladder statement

		else if (score >= 80) {
			grade = 'B';
		}

		else if (score >= 70) {
			grade = 'C';
		}
		// if-else-if ladder statement

		else if (score >= 60) {
			grade = 'D';
		}

		else if (score >= 50) {
			grade = 'E';
		}

		else {
			grade = 'F';

		}
		System.out.println("Grade = " + grade);
	}
}
