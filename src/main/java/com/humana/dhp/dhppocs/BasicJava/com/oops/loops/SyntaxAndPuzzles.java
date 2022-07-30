package com.humana.dhp.dhppocs.BasicJava.com.oops.loops;

public class SyntaxAndPuzzles {
    public static void main(String[] args) {
        for (int i = 0; i <=10; i++ ){
            //Here append means adding something/ attachment/
            System.out.print(i + " "); // I am putting space in between the string beacuse it will appending the space in the end of the number
//            System.out.println(i + ""); //I am no putting space in between the string beacuse it will not append the space in the end of the number
        }
        for (int i = 0; i<= 10; i = i +2 ){ // only print the even number
            System.out.println(i + " ");
        }
        int i = 10;
        for ( ; i<= 20; i++ ){
            System.out.println(i + "");
        }
        /**
         * why is it not printing the print statement?
         */
        for (int j=0; j<=11; j++) {

        if (j==2) {
            System.out.println("print valid");
            continue;
        } else if (j==9)
            System.out.println("printing valid too");
            break;

        }
    }

}
