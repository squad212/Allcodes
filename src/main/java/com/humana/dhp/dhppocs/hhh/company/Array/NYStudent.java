package com.humana.dhp.dhppocs.hhh.company.Array;

public class NYStudent {
	public static String address;
	public String name;
	public int semester;
	// no static method can use both static/non static variable/methods
	public void method1(int a, int b) {

		System.out.println(name);
		System.out.println(address);
		System.out.println(semester);

	}
	// static method can ONLY use both static variable/methods

	
}


