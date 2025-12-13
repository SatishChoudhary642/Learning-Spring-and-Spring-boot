package com.satish.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppGamingSpring {

	public static void main(String[] args) {
		
		try(var context =new  AnnotationConfigApplicationContext(GameConfiguration.class)){
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}
	}

}
