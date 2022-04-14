package com.humana.dhp.dhppocs.BasicJava.com.oops.IfElseCondition;

public class SwitchExcercise {
    public static void main(String[] args) {
        System.out.println(isWeekDay(2));
        System.out.println(determineNameOfDay(2));
        System.out.println(determineNameOfMonth(12));
    }

    public static String isWeekDay(int dayNumber) {
         String day = "";
        if (dayNumber == 1) {
            System.out.println("sunday");

        } else if (dayNumber == 2) {
            System.out.println("Monday");

        } else if (dayNumber == 3) {
            System.out.println("Tuesday");

        } else if (dayNumber == 4) {
            System.out.println("Wednesday");

        } else if (dayNumber == 7) {
            System.out.println("saturday");
        }
        return day;
    }

    public static String determineNameOfDay(int dayNumber) {
        String result = "";
        switch(dayNumber){
            case 1:
                result = "Sunday";
            case 2:
                result = "Monday";
            case 3:
                result = "Tuesday";
            case 4 :
               result = "Saturday";


    }
    return result;

}
public static String determineNameOfMonth(int monthNumber){
        String nameOfMonth = "";
        switch (monthNumber){
            case 1: nameOfMonth = "January";
            case 2: nameOfMonth = "February";
            case 12: nameOfMonth = "December";
        }

        return nameOfMonth;
}
}