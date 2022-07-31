package com.humana.dhp.dhppocs.BasicJava.com.oops.Method;

public class MethodCall {
    String fName = "shyam";
    String lName = "kc";
    int age = 20;

    public void personDetails(String fName, String lName, int age){
        System.out.println(fName  +  "\t" +lName +"\t"+ age);
    }

    public static void main(String[] args) {
        MethodCall methodCall = new MethodCall();
        methodCall.personDetails("Ram", "khadka", 25);
        methodCall.personDetails("Sarita", "Shrestha", 24);
    }
}
