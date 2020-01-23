package com.codeclan.example.bookSystem.controller;

import com.codeclan.example.bookSystem.models.Booking;
import com.codeclan.example.bookSystem.models.Course;
import com.codeclan.example.bookSystem.repositories.BookingRepository.BookingRepository;
import com.codeclan.example.bookSystem.repositories.CourseRepository.CourseRepository;
import com.codeclan.example.bookSystem.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;
import java.util.List;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {
    @Autowired
    CourseRepository courseRepository;
    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    BookingRepository bookingRepository;

    @GetMapping(value = "/rating/{rating}")
    public List<Course> findCourseByRating(@PathVariable int rating){
        return courseRepository.findCourseByRating(rating);
    }

    @GetMapping(value = "/booking/{customerId}")
    public List <Course> findCourseByBookingCustomerID(@PathVariable Long id){
        return courseRepository.findCourseByBookingsCustomerId(id);
    }



}
