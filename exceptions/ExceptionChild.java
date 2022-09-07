package com.java.exceptions;

class ExceptionChild extends ExceptionParent {

	void msg() throws ArithmeticException {
		System.out.println("child method");
	}

	public static void main(String args[]) {
		ExceptionParent p = new ExceptionChild();
		p.msg();
	}

}
