package com.java.oops;

class OverridingCat extends OverridingMammal {

	@Override
	public String speak() {
		return "Meow";
	}

	public static void main(String[] args) {
		OverridingMammal om = new OverridingHuman();
		System.out.println(om.speak());
	}
}