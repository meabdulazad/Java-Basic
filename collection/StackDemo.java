package com.java.collection;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

	/*
	 * it is sub-class of Vector.
	 * it implements the last-in-first-out (LIFO) structure i.e. Stack.
	 * it contains all methods of Vector class. in addition methods like
	 * boolean(), boolean peek(), boolean push(object o)
	 */
	
	public static void main(String[] args) {
		Stack<String> s=new Stack<String>();
		s.push("abdul");
		s.push("azad");
		s.push("ansari");
		s.push("wahid");
		s.push("ahad");
				
		System.out.println(s);
		System.out.println(s.get(1)+"\n");
		
		Iterator<String> itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
