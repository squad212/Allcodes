package com.humana.dhp.dhppocs.hhh.company.Abstract;

public class Sentra extends Nissan{
    public void drive(){
        System.out.println("Nissan drives so fast");
        }
    /**
     * if both the partent have the same method
     * go with own solution by overriding to solve diamond problem
     */
    public void MakeTurn(){
        System.out.println("go straight");
    }

    public void Music() {
    }

}
