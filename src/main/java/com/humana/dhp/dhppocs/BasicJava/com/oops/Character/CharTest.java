package com.humana.dhp.dhppocs.BasicJava.com.oops.Character;

public class CharTest {
    public static void main(String[] args) {
        //Created an object
        MyChar myChar = new MyChar('c');
        System.out.println(myChar.isVowel());
        System.out.println(myChar.isDigit());
        System.out.println(myChar.isAlphabet());
        System.out.println(myChar.isConsonant());
        //if any method is static we can make direct call to the class
        MyChar.printLowerCaseAlphabets();
        MyChar.printUpperCaseAlphabets();

    }
}
