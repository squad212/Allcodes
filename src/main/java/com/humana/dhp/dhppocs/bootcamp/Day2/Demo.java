package com.humana.dhp.dhppocs.bootcamp.Day2;

public class Demo {

    int x = 10; //Declaration and initialization with return type as int
    int y = 20;

    int display(Demo A, Demo B){
        A.x = 50;
        System.out.println("x = " + x);

        System.out.println("y = " + y);
        return 0;
    }

    public static void main(String[] args) {
        Demo C = new Demo();
        Demo D = new Demo();
        C.y = 22;

        C.display(C, D);
        D.display(C, D);

    }
}
