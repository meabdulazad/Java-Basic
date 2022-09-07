package com.java.oops;

class MethodOverridingDemo {
	// Driver class i.e functioning class
	public static void main(String[] args) {
		/*
		 * If a Parent type reference refers to a Parent object, then Parent's show is
		 * called out
		 */
		Parent obj1 = new Parent();
		obj1.show();

		/*
		 * If a Parent type reference refers to a Child object. Child's show() is called
		 * out. This is called RUN TIME POLYMORPHISM.
		 */
		Parent obj2 = new Child();
		obj2.show();

	}
}