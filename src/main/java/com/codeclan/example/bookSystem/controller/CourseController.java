package com.codeclan.example.bookSystem.controller;

import com.codeclan.example.bookSystem.models.Course;
import com.codeclan.example.bookSystem.repositories.CourseRepository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {
    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/courses/{rating}")
    public List<Course> findCourseByRating(@PathVariable int rating){
        return courseRepository.findCourseByRating(rating);
    }

    @GetMapping(value = "/courses/booking/{customerId}")
    public List <Course> findCourseByBookingCustomerID(@PathVariable Long id){
        return courseRepository.findCourseByBookingsCustomerId(id);
    }



}
