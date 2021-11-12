package com.humana.dhp.dhppocs.hhh.company.Inheritance;

public class Son extends Father{
    String firstName = "saroj";
    int age = 24;

    public Son(int ag, int age) {
        super(ag);
        this.age = age;
    }


    public void walk(){
        age = 3;
        System.out.println(age);
        System.out.println(this.age);
        System.out.println(super.age);
    }

    public void name() {
    }
}
