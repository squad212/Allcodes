package com.humana.dhp.dhppocs.BasicJava.com.oops.Arralist;

import java.util.ArrayList;

public class ListOfFamily {

    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        number.add(12);
        number.add(14);
        number.add(11);
        number.add(17);
        number.forEach((n) -> { System.out.println(n);});

        name.add("Saroj");
        name.add("Brutin");
        name.add("Momo");
        name.add("Milan");
        name.add("Shristi");
        System.out.println("nameOfFamily: " + name);
        name.forEach( (nameOfFamily) -> {System.out.println(nameOfFamily);});
    }
}
