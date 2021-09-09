package com.humana.dhp.dhppocs.hhh.company.Polymorphism;

import java.util.Scanner;

public class TestTrip {


	public static void main(String[] args) {
		System.out.println("show the calculation");
		Calculation c = new Calculation();
		c.add(2, 5);
		c.add("john", "doe");
		Trip t = new Trip();
		Scanner s = new Scanner(System.in);
		System.out.println("press 1 for bike, 2 for car, 3 for plane");
		int option = s.nextInt();

//		if (option == 1) {
//			Bike b = new Bike();
//			fun(b);
//		} else if (option == 2) {
//			Car c1 = new Car();
//			fun(c1);
//		} else {
//			Plane p = new Plane();
//			fun(p);
//		}

	}

	public static void fun(Trip t) {
		t.fun();
	}

}

