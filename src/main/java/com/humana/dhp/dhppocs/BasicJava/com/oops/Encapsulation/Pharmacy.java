package com.humana.dhp.dhppocs.BasicJava.com.oops.Encapsulation;

public class Pharmacy {
    /*
    pharmacy class has medicine and gives the total of two medicine
     */


    public  int priceBasedMedicine(String nameOfMedicine) {
        if (nameOfMedicine.equalsIgnoreCase("Ibrubrofen")) {
            return 20;
        } else if (nameOfMedicine.equalsIgnoreCase("Advil")) {
            return 42;
        } else {
            return 0;
        }
    }
        public int totalPriceOfMedicine(int priceOfMedicine1, int priceOfMedicine2){
            int sum = priceOfMedicine1 + priceOfMedicine2;
            return sum;
    }

    }

