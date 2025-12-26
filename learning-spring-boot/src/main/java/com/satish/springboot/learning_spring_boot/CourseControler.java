package com.satish.springboot.learning_spring_boot;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseControler {

    @RequestMapping("/course")
    public List<Course> getAllCourses(){
        return Arrays.asList(
            new Course(1, "Mern", "Code with chai"),
            new Course(2, "DSA in C++", "LoveBabar"),
            new Course(3,"Spring boot", "in28minutes")
        );
    }
}
