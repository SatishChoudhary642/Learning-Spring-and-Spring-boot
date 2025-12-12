package com.satish.game;

public class MarioGame implements GamingConsole{
    public void up(){
        System.out.println("Jump");
    }
    public void down(){
        System.out.println("Go in the hole");
    }
    public void left(){
        System.out.println("go back");
    }
    public void right(){
        System.out.println("Move forward");
    }
}
