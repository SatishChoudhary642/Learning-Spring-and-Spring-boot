package com.satish.sringboot.learn_jpa_and_hibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.satish.sringboot.learn_jpa_and_hibernate.course.jpa.CourseJpaRepository;


@Component
public class CourseCommandLineRunner implements CommandLineRunner{
    
    // @Autowired
    // private CourseRepository repository;

    @Autowired
    private CourseJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {

        Course c1 = new Course(1, "Learn C++ DSA", "LoveBabar");
        Course c2 = new Course(2, "Learn spring boot", "in28minutes");
        Course c3 = new Course(3, "Web dev", "Chai with code");
        Course c4 = new Course(4, "devOPs", "in28minutes");
        
        repository.insert(c1);
        repository.insert(c2);
        repository.insert(c3);
        repository.insert(c4);

        repository.deleteById(2);

        System.out.println(repository.findById(1));
        System.out.println(repository.findById(3));
    }
    
}
