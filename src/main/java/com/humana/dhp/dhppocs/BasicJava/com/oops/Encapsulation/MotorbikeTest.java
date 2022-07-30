package com.humana.dhp.dhppocs.BasicJava.com.oops.Encapsulation;

public class MotorbikeTest {
    public static void main(String[] args) {
        MotorBike ducati = new MotorBike(25);
        MotorBike r15 = new MotorBike(55);
        MotorBike suzuki = new MotorBike();
        ducati.run();
        r15.start();
        r15.stop();
        //initialization
        ducati.setSpeed(1200);
        System.out.println(ducati.getSpeed());
        //r15.setSpeed(100);
        System.out.println(r15.getSpeed());
        //reinitialization
        ducati.setSpeed(120);
        System.out.println(ducati.getSpeed());
        r15.setSpeed(100);
        System.out.println(r15.getSpeed());
        System.out.println(suzuki.getSpeed());
        /**
         * getting the current ducati speed which has been set above as 1200
         * increasing it by 100
         * setting the speed
         *
         * increasing the value of the variable
         */

       int ducatiSpeed = ducati.getSpeed(); //get ducati speed initial speed It is just initialization
        ducatiSpeed = ducatiSpeed + 200;//increase by 100
        ducati.setSpeed(ducatiSpeed);//set it in ducati speed
        System.out.println(ducatiSpeed);

        //Second level of increment and decrement of encapsulation method
        ducati.increaseSpeed(122);
        System.out.println(ducati.getSpeed());
        r15.decreaseSpeed(59);
        System.out.println(r15.getSpeed());

      MotorBike.stero(44); //if the method is static we can

    }
}
