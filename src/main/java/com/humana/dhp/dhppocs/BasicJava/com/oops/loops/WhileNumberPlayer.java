package com.humana.dhp.dhppocs.BasicJava.com.oops.loops;

public class WhileNumberPlayer {

    private int limit;

    public WhileNumberPlayer(int limit) {
        this.limit = limit;
    }

    public void printSquaresUptoLimit() {
        int i = 1;
        while (i*i < limit) {
            System.out.print(i * i + " ");
            i++;
        }
        System.out.println();
    }

    public void printCubesUptoLimit() {
        int j = 1;
        while (j * j * j < limit){
            System.out.print(j * j * j + " ");
            j++;
        }
        System.out.println();
    }
}
