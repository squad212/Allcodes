package com.humana.dhp.dhppocs.hhh.company.Abstract;

public abstract class Nissan implements ICar, IMusic {

    //abstract if the program is not complete
    // implements means it is taking the responsibility to complete the program more like inheritance
    public void start(){
        System.out.println("Nissan has started");
    }
    public void stop(){
        System.out.println("Nissan stopped");
    }

    /**
     * if both the partent have the same method
     * go with own solution by overriding to solve diamond problem
     */
    public void MakeTurn(){
        System.out.println("go straight");
    }
}
