package com.humana.dhp.dhppocs.hhh.company.Polymorphism;

public class Calculation {
	/**
	 * same method with different input in parameter
	 * overloading method
	 */

	public int add(int a, int b) {
		int sum = a+b;
		return sum;
	}
	public String add (String a, String b) {
		String sum = a+b;
		return sum;
	}
}
