package com.humana.dhp.dhppocs.BasicJava.com.oops.Encapsulation;

public class PharmacyTest {
    public static void main(String[] args) {

        Pharmacy pharmacy = new Pharmacy();
        int priceOfMedicine1 =  pharmacy.priceBasedMedicine("Ibrubrofen");
        int priceOfMedicine2 = pharmacy.priceBasedMedicine("Advil");
        int totalPriceOfMedicine = pharmacy.totalPriceOfMedicine(priceOfMedicine1, priceOfMedicine2);
        System.out.println(totalPriceOfMedicine);
        System.out.println(pharmacy.totalPriceOfMedicine(20,40));
    }
}
