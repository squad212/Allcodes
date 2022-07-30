package com.humana.dhp.dhppocs.bootcamp.Day2;

import java.util.TreeSet;

public class TreeSetPractise {
    public static void main(String[] args) {
        TreeSet<Integer> listOfNumber = new TreeSet<>();
        listOfNumber.add(23);
        listOfNumber.add(47);
        listOfNumber.add(56);
        listOfNumber.add(89);
        System.out.println("First Number from the List is : " + listOfNumber.pollFirst());
        System.out.println("Last Number form the List is : " + listOfNumber.pollLast());

    }
}
