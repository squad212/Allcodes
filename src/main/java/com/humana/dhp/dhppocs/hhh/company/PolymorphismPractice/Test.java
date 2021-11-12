package com.humana.dhp.dhppocs.hhh.company.PolymorphismPractice;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Trip t = new Trip();
        t.enjoy();
        t.fun();
        t.refreshment();
        Scanner sc = new Scanner(System.in);
        System.out.println("press 1 for having fun going from flight, 2 to enjoy in car");
        int option = sc.nextInt();
        if(option == 1){
            Flight f = new Flight();
            f.dance();
        }else{
            LemoCar lc = new LemoCar();
            lc.singing();
            lc.enjoy();
        }
    }
}
