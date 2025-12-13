package com.satish.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameConfiguration {

    @Bean
    public GamingConsole game(){
        var game= new PacmanGame();
        return game;
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game){
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }
}
