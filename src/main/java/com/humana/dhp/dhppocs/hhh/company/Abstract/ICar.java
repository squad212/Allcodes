package com.humana.dhp.dhppocs.hhh.company.Abstract;

public interface ICar {
    public void start();
    public void stop();
    public void drive();
    default void MakeTurn(){
        System.out.println("make left");
    }
}
