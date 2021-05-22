package com.example.bootcamp.controllers;

import com.example.bootcamp.models.Course;
import com.example.bootcamp.models.Topic;
import com.example.bootcamp.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/courses")
    public List<Course> getAllCourses(){
        return courseService.getAllCourses();
    }

    @GetMapping("/topics/{topicId}/courses")
    public List<Course> getAllCoursesByTopic(@PathVariable String topicId){
        return courseService.getAllCoursesByTopic(topicId);
    }

    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId){
        return courseService.getCourse(courseId);
    }

    @PostMapping("/topics/{topicId}/courses")
    public void addCourse(@RequestBody Course course, @PathVariable String topicId){
        course.setTopic(new Topic(topicId, "", ""));
        courseService.addCourse(course);
    }

    @PutMapping("/courses")
    public void updateCourse(@RequestBody Course course){
        courseService.updateCourse(course);
    }

    @DeleteMapping("/courses/{courseId}")
    public void deleteCourse(@PathVariable String courseId){
        courseService.deleteCourse(courseId);
    }


    @GetMapping("/hello")
    public String hello(){
        return "<h1>Hello World</h1>";
    }
}
