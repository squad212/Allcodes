package com.humana.dhp.dhppocs.BasicJava.com.oops.Encapsulation;

public class Car {

    private int speed; //initialization of member variable



    public void run(int speed) {
        System.out.println("Car runs in velocity of 0");
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed > 0) // validation if the speed is greater than 1. if the speed is minus not to get exception
            this.speed = speed;
    }

    public void increaseSpeed( int howMuch){
        //this.speed = this.speed + howMuch;
        setSpeed(this.speed + howMuch);
    }
    public  void decreaseSpeed(int howMuch){
        // if(this.speed - howMuch > 0) //if validation is repeated comment this line
       // this.speed = this.speed - howMuch; // call the method who is using the validation
        setSpeed(this.speed = this.speed - howMuch);
    }


}
