package com.humana.dhp.dhppocs.bootcamp.Day2.Assignments;

public class VikramSalary {
    public static void main(String[] args) {
        int totalSalary = 85000;
        float taxPercentage = 20;

        //Calculating the Tax Amount
        float displayedTaxAmount = (totalSalary - ( totalSalary / (1 + (taxPercentage/100))));
        System.out.println("Total tax amount paid by Vikram is : " + displayedTaxAmount);
    }
}
