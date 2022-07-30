package com.humana.dhp.dhppocs.BasicJava.com.oops.Encapsulation;

public class TestBook {
    /**
     * f I have to change the state of a class,
     * it should be through the actions the methods that are performed
     * through that specific class. This is one of the fundamental
     * principles of. capsulation encapsulation is
     * data and methods which access the data and set values to it.
     * So all modifications to the data of an object
     * should be through the methods of that specific object.
     *
     */
    public static void main(String[] args) {

    Book artOfComputerProgramming = new Book(1000);
    Book effectiveJava = new Book(900);
    Book cleanCode = new Book(800);

    artOfComputerProgramming.increaseNoOfCopies(7);
    effectiveJava.increaseNoOfCopies(2);
    cleanCode.increaseNoOfCopies(3);
    artOfComputerProgramming.decreaseNoOfCopies(1);
    effectiveJava.decreaseNoOfCopies(1);
    cleanCode.decreaseNoOfCopies(1);
        System.out.println(artOfComputerProgramming.getNoOfCopies());
        System.out.println(effectiveJava.getNoOfCopies());
        System.out.println(cleanCode.getNoOfCopies());

    //initializing the variable
    artOfComputerProgramming.setNoOfCopies(2);
        System.out.println(artOfComputerProgramming.getNoOfCopies());
    effectiveJava.setNoOfCopies(1);
    cleanCode.setNoOfCopies(5);
    //declarating and reinitializing
    artOfComputerProgramming.setNoOfCopies(4);

    artOfComputerProgramming.increaseNoOfCopies(2);
        System.out.println(artOfComputerProgramming.getNoOfCopies());
    cleanCode.decreaseNoOfCopies(2);
        System.out.println(cleanCode.getNoOfCopies());

    }
}
