package com.humana.dhp.dhppocs.hhh.company.ExceptionHandling;

public class MultiExcep {
    public static void main(String[] args) {
    try

    {
        int a = 10 / 2;


        int[] arr = new int[2];
        System.out.println(arr[1]);

        String s = "c";
        System.out.println(s.replace("a", "b"));
    }catch(
    ArithmeticException e)

    {
        System.out.println("do not divide number by 0");
    }catch(
    ArrayIndexOutOfBoundsException e)

    {
        System.out.println("Check the index value under the bound");
    }catch(
    NullPointerException e)

    {
        System.out.println("Change the null value of String");
    }

}
}

