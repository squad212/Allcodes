package com.humana.dhp.dhppocs.bootcamp.Day2.Assignments;

public class SimpleInterest {
    public static void main(String[] args) {
        int totalDepositAmount = 500000;
        int time = 5;
        double interestRate = 6.8;
        // calculationg the interest amount paid by Sarath
        double finalAmount = ((totalDepositAmount * time * interestRate)/100);
        System.out.println("Final Amount paid by Sarath is : " + finalAmount);
    }
}
