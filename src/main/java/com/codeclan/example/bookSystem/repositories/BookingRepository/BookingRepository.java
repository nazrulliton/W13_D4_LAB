package com.codeclan.example.bookSystem.repositories.BookingRepository;

import com.codeclan.example.bookSystem.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long>, BookingRepositoryCustom {
}
