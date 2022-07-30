package com.humana.dhp.dhppocs.hhh.company.Abstract;

public interface ICar {
    public void start();
    public void stop();
    public void drive();
    default void makeTurn(){
        System.out.println("make right turn");
    }
}
