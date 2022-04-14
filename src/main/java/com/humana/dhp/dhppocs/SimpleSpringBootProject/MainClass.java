package com.humana.dhp.dhppocs.SimpleSpringBootProject;

public class MainClass {
    public static void main(String[] args) {

        MarioGame game = new MarioGame();
        SuperMarioGame game1 = new SuperMarioGame();
        GameRunner runner = new GameRunner(game);
        runner.marioGameRunner();// method call
        game1.down();
        game1.Up();



    }
}
