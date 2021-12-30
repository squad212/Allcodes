package com.humana.dhp.dhppocs.BasicJava.com.oops.PrimitiveDataType;


import java.math.BigDecimal;

public class TestSimpleInterest {
    public static void main(String[] args) {

        /**
         * If we want the accurate value we use string otherwise it will be inaccurate number.
         * Always use the String constructor
         */
        BigDecimal num1 = new BigDecimal("2222.33");
        BigDecimal num2 = new BigDecimal("4445.87");
        BigDecimal num3 = num1.add(num2);
        System.out.println(num3);

        BigDecimal num11 = new BigDecimal(2222.33);
        BigDecimal num12 = new BigDecimal(4445.87);
        BigDecimal num13 = num1.add(num2);
        System.out.println(num13);

        int i = 5;
        int j = 2;
        BigDecimal number1 = new BigDecimal(5493.44);
        number1.add(new BigDecimal(i));
        System.out.println(number1);

        BigDecimal number2 = new BigDecimal(3);
        number2.multiply(new BigDecimal(j));
        System.out.println(number2);


        SimpleInterestCalculator calculator = new SimpleInterestCalculator("3833.00", "7.5");
        BigDecimal totalValue = calculator.calculateTotalValue(5);
        System.out.println(totalValue);

    }
}
