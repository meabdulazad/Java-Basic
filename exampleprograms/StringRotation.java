package com.java.exampleprograms;

public class StringRotation {

	/*
	 * Function checks if passed strings (str1 and str2) are rotations of each other
	 */
	static boolean areRotations(String s1, String s2, String s3) {
		/*
		 * There lengths must be same and str2 must be a substring of str1 concatenated
		 * with str1.
		 */
		if (s1.length() == s2.length())
			/*
			 * indexOf() will check whether string s2 value is present in the concatenate
			 * value of s1+s1, if not found then it returns value -1 so we have condition
			 * not equal to -1.
			 */
			return ((s1 + s1).indexOf(s2) != -1); // s1+s1 = ABCDABCD

		else if (s2.length() == s3.length())
			return ((s2 + s2).indexOf(s3) != -1); // s2+s2 = DABCDABC
		return false;
	}

	public static void main(String... args) {
		String s1 = "ABCD";
		String s2 = "DABC";
		String s3 = "BCDA";

		if (areRotations(s1, s2, s3))
			System.out.println("Strings: " + "\n" + s1 + "\n" + s2 + "\n" + s3 + "\n" + "are rotations of each other");
		else
			System.out.println("Strings: " + "\n" + s1 + "\n" + s2 + "\n" + s3 + "\n" + "are not rotations of each other");
	}
}