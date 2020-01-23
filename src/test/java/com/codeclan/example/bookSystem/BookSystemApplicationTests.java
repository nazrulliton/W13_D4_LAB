package com.codeclan.example.bookSystem;

import com.codeclan.example.bookSystem.models.Booking;
import com.codeclan.example.bookSystem.models.Course;
import com.codeclan.example.bookSystem.models.Customer;
import com.codeclan.example.bookSystem.repositories.BookingRepository.BookingRepository;
import com.codeclan.example.bookSystem.repositories.CourseRepository.CourseRepository;
import com.codeclan.example.bookSystem.repositories.CustomerRepository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
class BookSystemApplicationTests {
	@Autowired
	CourseRepository courseRepository;
	@Autowired
	BookingRepository bookingRepository;
	@Autowired
	CustomerRepository customerRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canFindCourseByRating(){
		List<Course> found = courseRepository.findCourseByRating(3);
		assertEquals("Java", found.get(0).getName());
	}

	@Test
	public void canFindCustomersByBookingCustomerId(){
		List<Customer> found = customerRepository.findCustomerByBookingsCourseId(1L);
		assertEquals(2, found.size());
	}

	@Test
	public void canFindCourseByBookingsCustomerId(){
		List<Course> found = courseRepository.findCourseByBookingsCustomerId(4l);
		assertEquals(2,found.size() );
	}

	@Test
	public void canFindBookingByDate(){
		List<Booking> found = bookingRepository.findBookingByDate("03-11-01");
		assertEquals(2, found.size());
	}

	@Test
	public void canFindBookingByTown(){
		List<Customer> found = customerRepository.findCustomerByBookingsCourseIdAndBookingsCourseTown( 1L, "Edinburgh");
		assertEquals(2, found.size());
	}

}
