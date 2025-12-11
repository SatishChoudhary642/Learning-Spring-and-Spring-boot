package com.satish.LearningConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {
    public static void main(String[] args) {

        // 1: Lanuch a spring context
        var context = new AnnotationConfigApplicationContext(ConfigForPerson.class);

        // 2: Configure the things that we want spring to manage
        // config -- @Configaration
        // name, age, address, person -- @Bean

        // 3: Retrieving Beans managed by spring
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("personByMethods")); 
        System.out.println(context.getBean("personByParameter"));

    }
}
