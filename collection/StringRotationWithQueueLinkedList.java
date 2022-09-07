package com.java.collection;

import java.util.LinkedList;
import java.util.Queue;

public class StringRotationWithQueueLinkedList {

	static boolean check_rotation(String s1, String s2) {
		if (s1.length() != s2.length());
		Queue<Character> q1 = new LinkedList<>(); //using Queue collection implementing LinkedList
		for (int i = 0; i < s1.length(); i++) {
			q1.add(s1.charAt(i));
		}
		Queue<Character> q2 = new LinkedList<>();
		for (int i = 0; i < s2.length(); i++) {
			q2.add(s2.charAt(i));
		}
		int k = s2.length();
		while (k > 0) {
			k--;
			char ch = q2.peek();
			q2.remove();
			q2.add(ch);
			if (q2.equals(q1))
				return true;
		}
		return false;
	}
	public static void main(String[] args) {
		String str1 = "ABCD";
		String str2 = "BCDA";
		String str3 = "ADBC";

		if (check_rotation(str1, str2))
			System.out.println(str2 + " is a rotated form of " + str1 + "\n");
		else
			System.out.println(str2 + " is not a rotated form of " + str1 + "\n");

		if (check_rotation(str1, str3))
			System.out.println(str3 + " is a rotated form of " + str1 + "\n");
		else
			System.out.println(str3 + " is not a rotated form of " + str1 + "\n");

		if (check_rotation(str2, str3))
			System.out.println(str3 + " is a rotated form of " + str2 + "\n");
		else
			System.out.println(str3 + " is not a rotated form of " + str2 + "\n");
	}
}
