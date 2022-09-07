package com.java.exampleprograms;

//Java Program to check Whether the String is Palindrome or not
public class PalindromeCheck { // main class

	// Returns true if string is a palindrome
	static boolean isPalindrome(String str) {

		/*
		 * Pointers pointing to the beginning and the end of the string
		 */
		int i = 0, j = str.length() - 1;

		/* While there are characters to compare */
		while (i < j) {

			// If there is a mismatch
			if (str.charAt(i) != str.charAt(j))
				return false;

			i++; // Increment first pointer
			j--; // decrement the other
		}

		return true; // Given string is a palindrome
	}

	// Main driver method
	public static void main(String[] args) {
		String str1 = "Abdul";
		String str2 = "RACEcar";

		// Change strings to UpperCase as Java is case sensitive.
		str1 = str1.toUpperCase(); // for LowerCase use "toLowerCase();"
		str2 = str2.toUpperCase();

		// For string 1
		System.out.print("String 1 : " + str1);
		System.out.println(); // new line for better readability

		if (isPalindrome(str1))
			System.out.print("It is a palindrome");
		else
			System.out.print("It is not a palindrome");

		System.out.println(); // new line for better readability

		// For string 2
		System.out.print("String 2 : " + str2);
		System.out.println();
		if (isPalindrome(str2))
			System.out.print("It is a palindrome");
		else
			System.out.print("It is not a palindrome");
	}

}
