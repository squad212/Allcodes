package com.humana.dhp.dhppocs.hhh.company.poly;

import java.util.Scanner;

public class PolyTest {
    public static void main(String[] args) {
        Trip t = new Trip();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1 to go trip through car, 2 to go through fligh");
        //polymorphism method
        int option = s.nextInt();

        if (option == 1) {
            Car c = new Car();
            enjoy(c);
            /**
             *
             * since trip is a parent class
             * Car c = new Trip;
             * Flight f = new Trip;
             */
        } else {
            Flight p = new Flight();
            fun(p);
        }

    }

        public static void fun (Trip t) {
            t.fun();
        }
        public static void enjoy(Trip t){
                t.enjoy();

    }
}