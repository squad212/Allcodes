package com.humana.dhp.dhppocs.hhh.company.Abstract;

public abstract class Nissan implements ICar{

    //abstract if the program is not complete
    // implements means it is taking the responsibility to complete the program more like inheritance
    public void start(){
        System.out.println("Nissan has started");
    }
    public void stop(){
        System.out.println("Nissan stopped");
    }
public void makeTurn(){
    System.out.println("make left turn");
}

}
