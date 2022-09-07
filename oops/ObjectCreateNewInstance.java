package com.java.oops;

public class ObjectCreateNewInstance {

	String str = "hello";

	public static void main(String args[]) {
		try {
			// creating object of class
			ObjectCreateNewInstance obj = ObjectCreateNewInstance.class.newInstance();
			System.out.println(obj.str);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
