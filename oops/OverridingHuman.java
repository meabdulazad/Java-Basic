package com.java.oops;

class OverridingHuman extends OverridingMammal {

	@Override
	public String speak() {
		return "Hello";
	}
	public static void main(String[] args) {
		//OverridingMammal om=new OverridingMammal(); // cannot instantiate because the access specifier is abstract.
		OverridingMammal om1= new OverridingCat();
		OverridingMammal om2= new OverridingHuman();
		System.out.println(om1.speak());
		System.out.println(om2.speak());
	}
}