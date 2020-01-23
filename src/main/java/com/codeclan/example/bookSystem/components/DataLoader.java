package com.codeclan.example.bookSystem.components;

import com.codeclan.example.bookSystem.models.Booking;
import com.codeclan.example.bookSystem.models.Course;
import com.codeclan.example.bookSystem.models.Customer;
import com.codeclan.example.bookSystem.repositories.BookingRepository.BookingRepository;
import com.codeclan.example.bookSystem.repositories.CourseRepository.CourseRepository;
import com.codeclan.example.bookSystem.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

public class DataLoader implements ApplicationRunner {
    @Autowired
    BookingRepository bookingRepository;
    @Autowired
    CourseRepository courseRepository;
    @Autowired
    CustomerRepository customerRepository;

    DataLoader(){

    }
    public void run(ApplicationArguments args){
        Course course1 = new Course("Python", "Edinburgh", 5);
        courseRepository.save(course1);
        Course course2 = new Course("Java", "Sterling", 3);
        courseRepository.save(course2);
        Course course3 = new Course("JavaScript", "Sterling", 5);
        courseRepository.save(course3);

        Customer customer1 = new Customer("Big Davie", "Edinburgh", 69);
        customerRepository.save(customer1);
        Customer customer2 = new Customer("Big Raz", "Glasgow", 41);
        customerRepository.save(customer2);

        Customer customer3 = new Customer("lil 'Gin", "LA", 35);
        customerRepository.save(customer3);
        Customer customer4 = new Customer("Lil Sandstorm", "Ske3t ske3t",21 );
        customerRepository.save(customer4);




        Booking booking1 = new Booking("09-11-01", course1, customer1);
        bookingRepository.save(booking1);
        Booking booking2 = new Booking("01-11-01", course2, customer2);
        bookingRepository.save(booking2);
        Booking booking3 = new Booking("02-11-01", course2, customer3);
        bookingRepository.save(booking3);
        Booking booking4 = new Booking("03-11-01", course1, customer4);
        bookingRepository.save(booking4);
        Booking booking5 = new Booking("03-11-01", course2, customer4);
        bookingRepository.save(booking5);
        
    }



}
