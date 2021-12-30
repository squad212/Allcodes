package com.humana.dhp.dhppocs.BasicJava.com.oops.Encapsulation;

public class Book {


    private int noOfCopies;// member variable

    public Book(int noOfCopies) {
        this.noOfCopies = noOfCopies;
    }

    void setNoOfCopies(int noOfCopies){//local variable
        /**
         * getting the member variable
         * and setting the value from the parameter
         */
        this.noOfCopies=noOfCopies;

    }
//    public void setNoOfCopies(int noOfCopies) {
//         this.noOfCopies = noOfCopies;
//    }

    public int getNoOfCopies() {
        return noOfCopies;
    }
//    public void increaseNoOfCopies(int howMuch){
//        this.noOfCopies=noOfCopies + howMuch;
//    }
//    public void decreaseNoOfCopies(int howMuch){
//        this.noOfCopies=noOfCopies + howMuch;
//    }

    public void increaseNoOfCopies(int howMuch){
        setNoOfCopies(this.noOfCopies + howMuch);

    }
    public void decreaseNoOfCopies(int howMuch){
        setNoOfCopies(this.noOfCopies - howMuch);

    }
}