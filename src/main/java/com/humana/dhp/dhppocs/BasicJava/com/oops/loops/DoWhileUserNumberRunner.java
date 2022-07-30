package com.humana.dhp.dhppocs.BasicJava.com.oops.loops;

import java.util.Scanner;

public class DoWhileUserNumberRunner {
    public static void main(String[] args) {

/**
 * Ask user a number
 * print the cube of the number
 * do not use the negative number
 */
        Scanner scanner = new Scanner(System.in);
        int number = -1;
        do {
            if( number != -1) {
                System.out.println("Cube Number is: " + (number * number * number));
            }
            System.out.println("Enter the number do display cubeNumber: ");
            number = scanner.nextInt();
        } while (number >= 0);
        System.out.println("Thank you! Have a Nice Day");
    }
}
