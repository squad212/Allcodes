package com.humana.dhp.dhppocs.BasicJava.com.oops.IfElseCondition;

public class SwitchExcercise {
    public static void main(String[] args) {
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
        }

        System.out.println(determineNameOfDay(2));
        System.out.println(determineNameOfMonth(12));
    }



    public static String determineNameOfDay(int dayNumber) {
        String result = "";
        switch (dayNumber) {
            case 1:
                result = "Sunday";
            case 2:
                result = "Monday";
            case 3:
                result = "Tuesday";
            case 4:
                result = "Saturday";


        }
        return result;

    }

    public static String determineNameOfMonth(int monthNumber) {
        String nameOfMonth = "";
        switch (monthNumber) {
            case 1:
                nameOfMonth = "January";
            case 2:
                nameOfMonth = "February";
            case 12:
                nameOfMonth = "December";
        }

        return nameOfMonth;
    }

}