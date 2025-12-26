package com.satish.sringboot.learn_jpa_and_hibernate.course.spring_data_jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.satish.sringboot.learn_jpa_and_hibernate.course.Course;
import java.util.List;


public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long>{

    List<Course> findByAuthor(String author);
} 
