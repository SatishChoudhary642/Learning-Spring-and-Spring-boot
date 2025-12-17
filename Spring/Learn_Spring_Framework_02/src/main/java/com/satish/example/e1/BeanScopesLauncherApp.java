package com.satish.example.e1;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class NormalClass {

	
}

@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class PrototypeClass{

}

@Configuration
@ComponentScan
public class BeanScopesLauncherApp {

	public static void main(String[] args) {
		
		try(var context =new  AnnotationConfigApplicationContext(BeanScopesLauncherApp.class)){

			//Same bean(Instance) for all calls --> Singleton
			System.out.println(context.getBean(NormalClass.class));
			System.out.println(context.getBean(NormalClass.class));

			// different instance for each time bean is refered to
			//-->Prototype
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));

			//There are more Spring bean Scopes like -
			//Request --> one object instance per single HTTP request
			//Session --> one object instance per user HTTP Session
			//Application --> one object instance per web application rutime
			//websocket --> one object instance per websocket instance
		}
	}

}
