package com.satish.game;

import org.springframework.stereotype.Component;

@Component
public class PacmanGame implements GamingConsole {

    public void up(){
        System.out.println("Pacman jump");
    }
    public void down(){
        System.out.println("Pacman goes into a hole");
    }
    public void left(){
        System.out.println("Pacman stops");
    }
    public void right(){
        System.out.println("Pacman accelerates");
    }
}