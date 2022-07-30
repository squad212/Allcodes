package com.humana.dhp.dhppocs.BasicJava.com.oops.Encapsulation;

public class Pharmacy {
  private String medicine1 = "Ibrubrofen";
    private String medicine2 = "Advil";


    public  int priceBasedMedicine(String nameOfMedicine) {
        if (nameOfMedicine.equalsIgnoreCase(medicine1)) {
            return 20;
        } else if (nameOfMedicine.equalsIgnoreCase(medicine2)) {
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

