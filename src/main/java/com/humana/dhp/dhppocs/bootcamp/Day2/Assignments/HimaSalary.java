package com.humana.dhp.dhppocs.bootcamp.Day2.Assignments;

public class HimaSalary {
    public static void main(String[] args) {
        int himaSalary = 85000;
        float taAmount = (15*85000/100);
        float daAmount = (20*85000/100);
        float hraAmount = (18*85000/100);
        float pfAmount = (20*85000/100);
        float taxAmount= (25*85000/100);

        //Calculating the Hira Gross amount and Displaying Net Amount

        float grossAmount = (himaSalary+taAmount + daAmount +hraAmount);
        float netAmount = (grossAmount-(pfAmount + taxAmount));

        System.out.println("The GrossAmount is: " + grossAmount);
        System.out.println("The NetAmount is: "+ netAmount);
    }
}
