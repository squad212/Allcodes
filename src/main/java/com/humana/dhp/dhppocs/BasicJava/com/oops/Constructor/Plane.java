package com.humana.dhp.dhppocs.BasicJava.com.oops.Constructor;

public class Plane {
    private int speed;

    Plane(int speed) { // Constructor which accept initial value
        this.speed = speed;
    }

    /**
     * we can initialize the value in the constructor calling the another constructor
     *
     */
    Plane(){
        this(22);
    }

    public void fly(int speed){
        System.out.println("plane fly in speed");
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed > 0) //Validation
        this.speed = speed;
    }
}
