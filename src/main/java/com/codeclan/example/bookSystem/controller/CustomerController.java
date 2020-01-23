package com.codeclan.example.bookSystem.controller;

import com.codeclan.example.bookSystem.models.Course;
import com.codeclan.example.bookSystem.models.Customer;
import com.codeclan.example.bookSystem.repositories.BookingRepository.BookingRepository;
import com.codeclan.example.bookSystem.repositories.CourseRepository.CourseRepository;
import com.codeclan.example.bookSystem.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/customers")
public class CustomerController {
    @Autowired
    CourseRepository courseRepository;
    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    BookingRepository bookingRepository;

    @GetMapping(value = "/courses/{id}")
    public List<Customer> findCustomerByCourseId(@PathVariable Long id){
        return customerRepository.findCustomerByBookingsCourseId(id);
    }




}
