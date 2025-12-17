package com.satish.example.f1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass {

	SomeDependancy someDependancy;

	public SomeClass(SomeDependancy someDependancy) {
		super();
		this.someDependancy = someDependancy;
		System.out.println("Dependency injected");
	} 

	@PostConstruct
	public void initialize(){
		someDependancy.getReady();
	}

	@PreDestroy
	public void cleanUp(){
		System.out.println("Clean up");
	}
}

@Component
class SomeDependancy {
	public void getReady(){
		System.out.println("Some logic using dependency");
	}
}

@Configuration
@ComponentScan
public class PrePostAnnotationContextLauncherApp {

	public static void main(String[] args) {
		
		try(var context =new  AnnotationConfigApplicationContext(PrePostAnnotationContextLauncherApp.class)){
			System.out.println("Context is up and running...");
		}
	}

}
