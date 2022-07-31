package com.humana.dhp.dhppocs.BasicJava.com.oops.Method;

public class Car {
    String firstCar = "Nissan";
    String secondCar = "Honda";
    String thirdCar = "Rav4";

    public int priceOfDifferentCar(String name) {
        if (name.equalsIgnoreCase(firstCar)) {
            return 2600;
        } else if (name.equalsIgnoreCase(secondCar)) {
            return 17000;
        } else if (name.equalsIgnoreCase(thirdCar)) {
            return 37000;
        } else {
            return 0;
        }
    }
    public int totalPriceForAllCar(int priceOfFirstCar, int priceOfSecondCar, int priceOfThirdCar) {
        int sumOfThreeCar = priceOfFirstCar + priceOfSecondCar + priceOfThirdCar;
        return sumOfThreeCar;
    }
}