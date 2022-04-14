package com.humana.dhp.dhppocs.BasicJava.com.oops.loops;

public class MyNumber {
    private int number;

    /*
    created a constructor which will take 1 parameter
     */
    public MyNumber(int number) {
        this.number = number;

    }

    public boolean isPrime() {
        //Guard Check
        if (number < 2) {
            return false;
        }
            // 2 to number-1 that mean if the number we pass 10 it will check until 9, if we pass 8 it will check until 7
            // How can check if a number is divisible by 2?
            for (int i = 2; i <= number - 1; i++) {
                if (number % i == 0) {
                    return true;
                }
            }
            return false;
        }

    public int sumUptoN() {
        int sum = 0;
        for ( int i = 0; i<= number-1; i++) {
            sum = sum + i;

        }
        return sum;
    }

    public int sumOfDivisors() {
        int sumOfDivisor = 0;
        for (int i = 2; i <= number-1; i++){
            if ( number % i == 0) {
                sumOfDivisor = sumOfDivisor + i;
            }
        }
        return sumOfDivisor;
    }

    public void printNumberTriangle() {
        // loop inside a loop; here in a loop i running inside it j running
        for (int i = 1; i<= number; i++){
            for(int j = 1; j<= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
