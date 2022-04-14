package com.humana.dhp.dhppocs.BasicJava.com.oops.Encapsulation;

public class MotorBike {
    //state/has/data
    String steroMeter;
    public int stero;
    private int speed; //member variable


    public static void stero(int steroSpeed ){

    }

    public MotorBike(){
        this(5);
    }
    public MotorBike(int speed) {
        this.speed = speed;
    }
    public MotorBike(int speed, int stero) {
        this.speed = speed;
        this.stero = stero;
    }

    //behavior/action/does/methods/operation
    //methodname- setSpeed
    //input- int speed
    //output = void

    void setSpeed(int speed){//local variable
        if (speed > 0)
        /**
         * accessing the member variable and
         * setting the value from the parameter
         */
        this.speed = speed;

    }
    int getSpeed(){
        /**
         *  We have used this to refer to this specific object
         *  inside the object, return this p value over here.
         */
        return this.speed;
    }

    /**
     * second level of encapsulation
     * rather than getting and setting this is the easiest method
     * create increase and decease method
     * and pass the value in the parameter
     */

    public void increaseSpeed(int howMuch){
        setSpeed(this.speed + howMuch);
    }
//    public void decreaseSpeed(int howMuch){
//        if (speed - howMuch > 0)
//        this.speed= speed - howMuch;
//    }

    //or
    public void decreaseSpeed(int howMuch){
        setSpeed(this.speed -howMuch);
    }

    void start(){

    }
    void run(){

    }
    void stop(){

    }



}
