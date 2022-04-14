package com.humana.dhp.dhppocs.SimpleSpringBootProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

    @Autowired
    private GamingConsole game; //declaration a variable of MarioGame object

    public GameRunner(GamingConsole game) {//this constructor take one parameter
        this.game = game;
    }

    /**
     * create a constructor method that take one parameter to run the game
     */
    public void marioGameRunner(){
        game.Up();
        game.down();
        game.left();
        game.right();

    }


}
