package com.humana.dhp.dhppocs.SimpleSpringBootProject;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole {

    /*
    here basically we use concept/logic to run the game
    if we press up, down, left, right
     */
    @Override
    public void Up(){
        System.out.println("Press up to Jump");
    }
    @Override
    public void down(){
        System.out.println("Press down to sit");
    }
    @Override
    public void left(){
        System.out.println("Press left to turn left");
    }
    @Override
    public void right(){
        System.out.println("Press right to turn right");
    }

}
