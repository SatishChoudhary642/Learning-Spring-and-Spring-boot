package com.satish.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.satish.game")
public class GamingAppLuancher {

	public static void main(String[] args) {
		
		try(var context =new  AnnotationConfigApplicationContext(GamingAppLuancher.class)){
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}
	}

}
