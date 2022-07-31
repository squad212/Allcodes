package com.humana.dhp.dhppocs.BasicJava.com.oops.Method;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        int priceOfFirstCar = car.priceOfDifferentCar("Nissan");
        System.out.println("Amount paid for first Car : " + priceOfFirstCar);
        int priceOfSecondCar = car.priceOfDifferentCar("Honda");
        System.out.println("Amount paid for second Car : " + priceOfSecondCar);
        int priceOfThirdCar = car.priceOfDifferentCar("Rav4");
        System.out.println("Amount paid for third Car : " + priceOfThirdCar);
        int result = car.totalPriceForAllCar(priceOfFirstCar, priceOfSecondCar, priceOfThirdCar);
        System.out.println("Total Amount paid for three car through out the year :" + result);
    }

}
