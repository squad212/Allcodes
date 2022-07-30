package com.humana.dhp.dhppocs.BasicJava.com.oops.loops;

public class NumberRunner {
    public static void main(String[] args) {
        //Calls the constructor method and intialize the value of number
        // in the member variable through parameter
        MyNumber number = new MyNumber(6);
       //initialization of new variable
        //method call
        boolean isPrime = number.isPrime();
        int sum = number.sumUptoN();
        int sumOfDivisor = number.sumOfDivisors();

        System.out.println("isPrime: " + isPrime);
        System.out.println("The Sum of the number: " + sum);
        System.out.println("Sum of Divisor: " + sumOfDivisor);
        number.printNumberTriangle();
    }
}
