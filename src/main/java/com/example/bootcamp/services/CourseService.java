package com.example.bootcamp.services;

import com.example.bootcamp.models.Course;
import com.example.bootcamp.models.Course;
import com.example.bootcamp.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses(){
        return courseRepository.findAll();
    }

    public List<Course> getAllCoursesByTopic(String topicId){
        return courseRepository.findByTopicId(topicId);
    }

    public Course getCourse(String id){
        return courseRepository.findById(id).get();
    }

    public void addCourse(Course course){
        courseRepository.save(course);
    }

    public void updateCourse(Course course){
        courseRepository.save(course); // it checks whether there is already a pk in the same id
    }

    public void deleteCourse(String id) {
        courseRepository.deleteById(id);
    }
}
