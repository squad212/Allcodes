package com.humana.dhp.dhppocs.BasicJava.com.oops.IfElseCondition;

import java.util.Scanner;

public class IfElseTest {
    public static void main(String[] args) {
        /**
         * Ask user for Input
         *  Enter two numbers
         *  Choose an Operation
         *      * add
         *      * multiply
         *      * divide
         *      * subtract
         *     publish return
         *
         *     enter number1:
         *     enter number2:
         *
         *
         *
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for number1: ");
        int number1 = sc.nextInt();

        System.out.println("Enter 2 for number2: ");
        int number2 = sc.nextInt();

        System.out.println("Choices available are: ");
        System.out.println("1 - Add");
        System.out.println("2 - Sub");
        System.out.println("3 - Mul");
        System.out.println("4 - Div");

        System.out.println("Enter a choice: ");
        int choice = sc.nextInt();

        if (choice ==1 ){
            System.out.println("Results: "+ (number1 + number2));
        }else if (choice == 2){
            System.out.println("Results: "+ (number1 - number2));
        }else if(choice == 3){
            System.out.println("Results: " + (number1 * number2));
        }else if(choice == 4){
            System.out.println("Results: " + (number1 % number2));
        }

    }
}
