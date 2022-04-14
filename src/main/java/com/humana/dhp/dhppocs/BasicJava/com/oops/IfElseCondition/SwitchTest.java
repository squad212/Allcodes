package com.humana.dhp.dhppocs.BasicJava.com.oops.IfElseCondition;

public class SwitchTest {
    public static void main(String[] args) {
        //System.out.println(determineNameOfDay(0));
        System.out.println(isWeekDay(3));

        /**
         * number of day is 0 (sunday) to 6 (Saturday)
         * return the day of a week in text
         */
    }

    public static String determineNameOfDay(int dayNumber) {
        String result = "result";
        switch (dayNumber) {
//                case 0:
//                    result = "Sunday";
//                    break;
//                case 1:
//                    result = "Monday";
//                    break;
//                case 2:
//                    result = "Tuesday";
//                    break;
//                case 3:
//                    result = "Wednesday";
//                    break;
//                case 4:
//                    result = "Thursday";
//                    break;
//                case 5:
//                    result = "Friday";
//                    break;
//                case 6:
//                    result = "Saturday";
//                    break;

            case 0:
                return "Sunday";
            case 1:
                return "Monday";
            case 2:
                return "Tueday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
        }
        return result;

    }

    /**
     *
     * @param weekday
     * @return
     */

    public static boolean isWeekDay(int weekday) {
        switch (weekday) {
            case 1:
            case 4:
            case 6:
                return true;
            case 2:
            case 3:
            case 5:
                return false;

        }
        return false;
    }

}