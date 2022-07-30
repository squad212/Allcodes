package com.humana.dhp.dhppocs.SimpleSpringBootProject;

import org.springframework.stereotype.Component;

@Component
public class SuperMarioGame implements GamingConsole {

    public void Up() {
        System.out.println("up");
    }

    public void down() {
        System.out.println("down");
    }

    public void left() {
        System.out.println("left");
    }

    public void right() {
        System.out.println("right");
    }
}
