package com.humana.dhp.dhppocs.bootcamp.Day2.Assignments;
import java.util.*;

public class PizzaTotalPrice {
    //local variable
    double pizzaPrice;
    int quantity ;
    int discountPercentage;

    public static void main(String[] args) {

        //local variable
        double pizzaPrice;
        int quantity ;
        int discountPercentage ;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the price of pizza : ");
        pizzaPrice = scanner.nextDouble();

        System.out.println("Enter the number of pizza you would like to buy: ");
        quantity = scanner.nextInt();

        System.out.println("Enter the discount percent for the pizza : ");
        discountPercentage = scanner.nextInt();

        double totalAmount = (pizzaPrice * quantity-(pizzaPrice * quantity * discountPercentage/100));
        System.out.println("The final price of pizza after discount is : " + totalAmount);

//        Calculating the final bill Amount

       /* double pizzaPrice = 399.0;
        int quantity = 2;
        int discountPercentage = 20;
        double totalAmount = (pizzaPrice * quantity - ( pizzaPrice * quantity * discountPercentage / 100));
        System.out.println(" The final bill that customer paid for 2 pizza's with applied discount : " + totalAmount);*/
    }

}
