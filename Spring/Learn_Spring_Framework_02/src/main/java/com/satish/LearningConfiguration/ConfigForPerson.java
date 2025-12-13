package com.satish.LearningConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {};
record Address(String street, String city){};

@Configuration
public class ConfigForPerson {

    @Bean
    public String name(){
        return "Satish";
    }

    @Bean
    public int age(){
        return 21;
    }

    @Bean(name="address1")
    public Address address(){
        return new Address("Bakers", "Landon");
    }

    @Bean(name="address2")
    @Primary //makes default or the primary when there are multiple same type beans
    public Address address3(){
        return new Address("FC road", "Pune");
    }

    @Bean
    public Person personByParameter(String name, int age, Address address1){
        return new Person(name, age, address1);
    }

    @Bean 
    public Person personByMethods(){
        return new Person(name(), age(), address3());
    }
}