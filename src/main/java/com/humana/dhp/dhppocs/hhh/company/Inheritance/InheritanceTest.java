package com.humana.dhp.dhppocs.hhh.company.Inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        Son s = new Son(21,14);
        System.out.println(s.address);
        s.name();
        System.out.println(s.name);
        s.walk();
        System.out.println(s.name);
        System.out.println(s.age);
    }
}
