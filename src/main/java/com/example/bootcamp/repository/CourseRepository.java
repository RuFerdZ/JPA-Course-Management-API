package com.example.bootcamp.repository;

import com.example.bootcamp.models.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, String> {

    List<Course> findByTopicId(String id);

    List<Course> findAll();
}
