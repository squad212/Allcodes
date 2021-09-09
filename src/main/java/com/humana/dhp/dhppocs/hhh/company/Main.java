package com.humana.dhp.dhppocs.hhh.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");

        String name = sc.nextLine();
        System.out.println("Hello " + name);

        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("My age is " + age);

        boolean doExit = true;
        while (doExit) {
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Enter 1 to subtract, 2 to exit");
            int option = sc1.nextInt();
            if (option == 1)
            {
                System.out.println("Enter the first number to Subtract");
                int number1 = sc1.nextInt();
                System.out.println("Enter the second number to subtract");
                int number2 = sc1.nextInt();
                int sub = number1 - number2;
                System.out.println("Sub is:" + sub);}
//            else (option ==2 )
//                break;

            int i= 0;
            for (i = 0; i< 4; i++ ) {
                System.out.println("Print valid ");
                if (i == 2)
                    continue;
                else if (i==5)
                    break;
            }

        }
    }
}
