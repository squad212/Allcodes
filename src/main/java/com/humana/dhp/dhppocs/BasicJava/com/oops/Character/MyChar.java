package com.humana.dhp.dhppocs.BasicJava.com.oops.Character;

public class MyChar {

    private char ch;

    public MyChar(char ch) {
        this.ch = ch;
    }

    public boolean isVowel() {
        if(ch == 'a' ||  ch == 'A')
            return true;
        if(ch == 'e')
            return true;
        if(ch == 'i')
            return true;
        if(ch == 'o')
            return true;
        if(ch == 'u')
            return true;
        return false;
    }

    public boolean isDigit() {
        if(ch >= 48 && ch <=57) //between 0 to 9
            return true;
        return false;

    }

    public boolean isAlphabet() {
        if(ch >=97 && ch <=122)//between 'a' to 'z'
            return true;

        if (ch >= 65 && ch <= 90)//between 'A' to 'Z'
            return true;

        return false;
    }

    public boolean isConsonant(){
        if(isAlphabet() && !isVowel())
            return true;
        return false;
    }

    public static void printLowerCaseAlphabets() {
        for(char ch = 'a'; ch <= 'z'; ch++){
            System.out.println(ch);
        }
    }
    public static void printUpperCaseAlphabets() {
        for(char ch = 'A'; ch <= 'Z'; ch++){
            System.out.println(ch);
        }
    }
}
