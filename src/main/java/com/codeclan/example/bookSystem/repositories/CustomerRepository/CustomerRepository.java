package com.codeclan.example.bookSystem.repositories.CustomerRepository;

import com.codeclan.example.bookSystem.models.Course;
import com.codeclan.example.bookSystem.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;


public interface CustomerRepository extends JpaRepository<Customer, Long> {
     List<Customer> findCustomerByBookingsCourseId(Long id);
     List<Customer> findCustomerByBookingsCourseIdAndBookingsCourseTown(Long id, String town);


}


