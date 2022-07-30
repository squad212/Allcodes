package com.humana.dhp.dhppocs.BasicJava.com.oops.IfElseCondition;

import java.util.Scanner;

public class IfElseTest {
    public static void main(String[] args) {
        System.out.println(givesDay(2));
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

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the firstNumber: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter the secondNumber: ");
        int secondNumber = scanner.nextInt();

        System.out.println("Check for the Possible options that are available for the calcuation");
        System.out.println("1 - add");
        System.out.println("2 = sub");
        System.out.println("3 - mul");
        System.out.println("4 - div");

        System.out.println("Enter a choice");
        int option = scanner.nextInt();
        extracted(firstNumber, secondNumber, option);


//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter 1 for number1: ");
//        int number1 = sc.nextInt();
//
//        System.out.println("Enter 2 for number2: ");
//        int number2 = sc.nextInt();
//
//        System.out.println("Choices available are: ");
//        System.out.println("1 - Add");
//        System.out.println("2 - Sub");
//        System.out.println("3 - Mul");
//        System.out.println("4 - Div");
//
//        System.out.println("Enter a choice: ");
//        int choice = sc.nextInt();
//
//        if (choice ==1 ){
//            System.out.println("Results: "+ (number1 + number2));
//        }else if (choice == 2){
//            System.out.println("Results: "+ (number1 - number2));
//        }else if(choice == 3){
//            System.out.println("Results: " + (number1 * number2));
//        }else if(choice == 4){
//            System.out.println("Results: " + (number1 % number2));
    }

    private static void extracted(int option, int firstNumber, int secondNumber) {
        if (option == 1) {
            System.out.println("Addition of the two number: " + (firstNumber + secondNumber));
        } else if (option == 2) {
            System.out.println("Subtraction of the two number: " + (firstNumber - secondNumber));
        } else if (option == 3) {
            System.out.println("multiplication of the two number: " + (firstNumber * secondNumber));
        } else if (option == 4) {
            System.out.println("division of the two number: " + (firstNumber / secondNumber));
        } else {
            System.out.println("Non of the choice matches");
        }

        int time = 16;
        if (time < 8) {
            System.out.println("Good Morning");
        } else if (time < 14) {
            System.out.println("Good After noon");
        } else {
            System.out.println("Good evening");
        }

        //Ternary operator
        // variable = (condition) ? expressionTrue :  expressionFalse;
        String result = (time < 10) ? "Good Afternoon" : "Good Evening";
        System.out.println(result);
    }



    private int dayNumber;
    public static String givesDay(int dayNumber) {
        String weekDay = "";
        if (dayNumber == 1) {
            System.out.println("sunday: " + "Weekdays");

        } else if (dayNumber == 2) {
            System.out.println("Monday: " + "Weekdays");

        } else if (dayNumber == 3) {
            System.out.println("Tuesday : " + "Weekdays");

        } else if (dayNumber == 4) {
            System.out.println("Wednesday: " + "Weekdays");

        } else if (dayNumber == 7) {
            System.out.println("saturday");
        }
        return weekDay;

        // can be done through 2 ways
    /*
    initialize the variable an
     */

    }
}


