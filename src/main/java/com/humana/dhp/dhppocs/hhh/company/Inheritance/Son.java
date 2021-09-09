package com.humana.dhp.dhppocs.hhh.company.Inheritance;

public class Son extends Father{
    String firstName = "saroj";
    int a = 18;

    public Son( ){

        System.out.println("Son's Constructor");
    }
    public void run(){
        a = 17;
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }
}
