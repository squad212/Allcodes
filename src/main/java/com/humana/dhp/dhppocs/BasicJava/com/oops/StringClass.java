package com.humana.dhp.dhppocs.BasicJava.com.oops;

import java.util.ArrayList;

public class StringClass{


    public static void main(String[] args) {

        String someString = "This is a long text";
        String phoneNumber = "469-288-7232";

      ArrayList<String> name = new ArrayList <>();
      name.add("Saroj");
      name.add("Sarita");
      name.add("Brutin");
      name.add("Myself");
        System.out.println(name);

        String names = "Saroj Khatri";
        String [] namesArr = names.split("Saroj Khatri");
        //String firstName = namesArr[0];
        //String lastName = namesArr[1];
        //System.out.println( lastName);
        for (int i = 0; i < someString.length(); i++){
            System.out.println(someString.charAt(i)); //it loops through somestring.lenght and print all the alp
            // charAt(5) -> It will prints the index of the number 5 which is i
            System.out.println(someString.indexOf("a")); // indexOf is used to find the specific character is present or not and give number of index.
            //yedi cha vaney first index of character dincha. we use to find index of string or substring of a specific character.
            System.out.println(someString.indexOf("long"));
            System.out.println(someString.substring(3)); //it is used to print the indexof the specific character and after it //
            //kaha bata print
            System.out.println(someString.substring(4,9)); //kaha bata kaha samma matra print garne

            System.out.println(name.indexOf("Myself"));
            System.out.println(someString.isEmpty()); //to check if it is empty.
            System.out.println(someString.equals("This is a long text"));

            String str2 = someString.concat(".");
            System.out.println(str2);
            System.out.println(phoneNumber.split("469-288-7232"));
            System.out.println(phoneNumber.trim()); // it removes the extra spacing at start and end
        }

    }

}