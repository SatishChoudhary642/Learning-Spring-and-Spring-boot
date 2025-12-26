package com.satish.sringboot.learn_jpa_and_hibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.satish.sringboot.learn_jpa_and_hibernate.course.jpa.CourseJpaRepository;
import com.satish.sringboot.learn_jpa_and_hibernate.course.spring_data_jpa.CourseSpringDataJpaRepository;


@Component
public class CourseCommandLineRunner implements CommandLineRunner{
    
    // @Autowired
    // private CourseRepository repository;

    // @Autowired
    // private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;
    @Override
    public void run(String... args) throws Exception {

        Course c1 = new Course(1, "Learn C++ DSA", "LoveBabar");
        Course c2 = new Course(2, "Learn spring boot", "in28minutes");
        Course c3 = new Course(3, "Web dev", "Chai with code");
        Course c4 = new Course(4, "devOPs", "in28minutes");
        
        // repository.insert(c1);
        // repository.insert(c2);
        // repository.insert(c3);
        // repository.insert(c4);

        // repository.deleteById(2);

        // System.out.println(repository.findById(1));
        // System.out.println(repository.findById(3));

        repository.save(c1);
        repository.save(c2);
        repository.save(c3);
        repository.save(c4);

        repository.deleteById(1l);

        System.out.println(repository.findById(1l));
        System.out.println(repository.findById(3l));

        System.out.println(repository.findAll());

        System.out.println(repository.count());

        System.out.println(repository.findByAuthor("in28minutes"));
    }
    
}
