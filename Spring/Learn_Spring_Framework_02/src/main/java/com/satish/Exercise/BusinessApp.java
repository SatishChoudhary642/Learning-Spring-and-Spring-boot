package com.satish.Exercise;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.satish.Exercise")
public class BusinessApp {

    public static void main(String[] args) {
        System.out.println("BusinessApp running");
        try(var context = new AnnotationConfigApplicationContext(BusinessApp.class)){
            System.out.println(context.getBean(BusinessCalculationService.class).findMax());
        }
    }
}
