package com.humana.dhp.dhppocs.BasicJava.com.oops.Method;

public class ReturnNumber {

    public static int calculateNumber(int x){
        return 5 + x;
    }
    public static int calculateTwoNumber(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(calculateNumber(5));
        System.out.println(calculateTwoNumber(3,8));
    }
}
