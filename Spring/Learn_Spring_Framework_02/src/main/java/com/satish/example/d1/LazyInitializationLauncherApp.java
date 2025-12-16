package com.satish.example.d1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA {
	
}

@Component
@Lazy
class ClassB {
	private ClassA classA;

	public ClassB(ClassA classA){
		System.out.println("Some Initialization logic");
		this.classA=classA;
	}
}

@Configuration
@ComponentScan
public class LazyInitializationLauncherApp {

	public static void main(String[] args) {
		
		try(var context =new  AnnotationConfigApplicationContext(LazyInitializationLauncherApp.class)){
			System.out.println("Initialization of context complete");
			context.getBean(ClassB.class);
		}
	}

}
