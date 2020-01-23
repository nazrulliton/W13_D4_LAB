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

import java.util.List;

@RestController
@RequestMapping(value = "/bookings")
public class BookingController {
    @Autowired
    CourseRepository courseRepository;
    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    BookingRepository bookingRepository;


    @GetMapping(value = "/date/{date}")
    public List<Booking> findBookingByDate(@PathVariable String date){
        return bookingRepository.findBookingByDate(date);
    }


}
