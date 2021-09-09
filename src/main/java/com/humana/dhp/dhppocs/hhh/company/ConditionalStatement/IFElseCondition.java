package com.humana.dhp.dhppocs.hhh.company.ConditionalStatement;

import java.util.Scanner;

public class IFElseCondition {

    public static void main(String[] args) {
        //for loop statement
        for(int i=0; i<10; i++)
        {
            System.out.println("print valid");
            if (i==2)
                continue;
            else if (i==9)
                break;

            //while loop statement
            boolean doExit = true;
             while (doExit)
             //to take the input from the system
                 System.out.println("Enter 1 to add, 2 to exit");
             Scanner sc = new Scanner(System.in);
             int option = sc.nextInt();
             if (option ==1)
             {
                 System.out.println("Enter the first number to add");
                 int number1 = sc.nextInt();
                 System.out.println("Enter the second number to add");
                 int number2 = sc.nextInt();
                 int add = number1 + number2;
                 System.out.println("Sum is:" + add);}
             else if (option ==2)
                break;



            Scanner sc1 = new Scanner(System.in);
        double number1, number2, number3;
        System.out.println("Enter three number");
        number1 = sc1.nextDouble();
        number2 = sc1.nextDouble();
        number3 = sc1.nextDouble();

        double sum = (number1 + number2 + number3);
        if (sum <= 100) {
            System.out.println("You are below the threshold");
        }
        else {
            System.out.println("Your are above the threshold");
        }
        }

        /**
         * int [] a = {10,20,30}
         * for (int a = 0; i<a.lenght, i++)
         * { sout(a{i})
         * }
         */
        /**int a = 0;
         * while (i< a.length)
         * { sout (a{i});
         * } i++
         */
    Scanner sc2 = new Scanner(System.in);

    int number1 = sc2.nextInt();
    int  number2 = sc2.nextInt();
    int number3 = sc2.nextInt();
    int sum = number1 + number2 + number3;
    if (sum <=100){
        System.out.println("You are below the threshold");
    }
    else {
        System.out.println("you are above the threshold");
    }

    }
}



