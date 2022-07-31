package com.humana.dhp.dhppocs.BasicJava.com.oops.Method;

import com.humana.dhp.dhppocs.BasicJava.com.oops.Method.Pharmacy;

import java.util.ArrayList;

public class PharmacyTest {
    public static void main(String[] args) {

        Pharmacy pharmacy = new Pharmacy();
        int priceOfMedicine1 =  pharmacy.priceBasedMedicine("Ibrubrofen");
        int priceOfMedicine2 = pharmacy.priceBasedMedicine("Advil");
        int totalPriceOfMedicine = pharmacy.totalPriceOfMedicine(priceOfMedicine1, priceOfMedicine2);
        System.out.println(totalPriceOfMedicine);
        System.out.println(pharmacy.totalPriceOfMedicine(20,40));

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for(String listOfCar: cars){
            System.out.println(listOfCar);
        }
        ArrayList<String> listOfCars = new ArrayList<>();
        listOfCars.add("RX");
        listOfCars.add("BMW");
        listOfCars.forEach(list -> System.out.println(list));
        }


}

