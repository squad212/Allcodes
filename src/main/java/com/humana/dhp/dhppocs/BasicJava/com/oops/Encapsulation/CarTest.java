package com.humana.dhp.dhppocs.BasicJava.com.oops.Encapsulation;

public class CarTest {
    public static void main(String[] args) {
        /**
         * Created a reference object of the Car
         */
        Car car = new Car();

        Car toyota = new Car();
        Car hondai = new Car();

        toyota.setSpeed(100);
        System.out.println(toyota.getSpeed());
        hondai.setSpeed(120);
        System.out.println(hondai.getSpeed());

        toyota.increaseSpeed(100);
        hondai.increaseSpeed(223);
        System.out.println(toyota.getSpeed());
        System.out.println(hondai.getSpeed());

        toyota.decreaseSpeed(50);
        hondai.decreaseSpeed(50);
        System.out.println(toyota.getSpeed());
        System.out.println(hondai.getSpeed());


/**
 * we ccan replace this long code by adding increase method in parent class
 */
//        int toyotaSpeed = toyota.getSpeed(); //re-initialization
//        toyotaSpeed = toyotaSpeed + 100;
//        toyota.setSpeed(toyotaSpeed);
//        System.out.println(toyota.getSpeed());
//
//        int hondaiSpeed = hondai.getSpeed();
//        hondaiSpeed = hondaiSpeed + 223;
//        hondai.setSpeed(hondaiSpeed);
//        System.out.println(hondaiSpeed);



    }
}
