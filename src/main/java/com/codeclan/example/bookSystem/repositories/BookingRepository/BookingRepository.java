package com.codeclan.example.bookSystem.repositories.BookingRepository;

import com.codeclan.example.bookSystem.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;


public interface BookingRepository extends JpaRepository<Booking, Long>{

    List<Booking> findBookingByDate(String date);
}
