package com.humana.dhp.dhppocs.BasicJava.com.oops.Constructor;

public class PlaneTest {
    public static void main(String[] args) {
/**
 * Constructor is a special method
 * if we want to initialize the value in the initial state we need constructor.
 * Constructor doesn't require return type
 */
        Plane americanAirline = new Plane(50);
        Plane deltaAirline = new Plane(20);
        americanAirline.setSpeed(100);
        deltaAirline.setSpeed(133);
        System.out.println(americanAirline.getSpeed());
        System.out.println(deltaAirline.getSpeed());
    }
}
