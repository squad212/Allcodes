package com.humana.dhp.dhppocs.bootcamp.Day2;

//import java.util.Stack;
import java.util.*; //used for all class and interfaces

public class StackExample1{
    public static void main(String[] args) {
        Stack stack = new Stack();
        //pushing the elements in the stack
        stack.push("BMW");
        stack.push("Ferrari");
        stack.push("Toyota");
        stack.push("Mazada");
        //iterator over the stack
        Iterator iterator = stack.iterator();
        while(iterator.hasNext())
        {
            Object values = iterator.next();
            System.out.println(values);

        }
    }


}
