package com.humana.dhp.dhppocs.hhh.company.Abstract;

public interface IMusic {
    public void Music();
    default void MakeTurn(){
        System.out.println("make right");
    }
}
