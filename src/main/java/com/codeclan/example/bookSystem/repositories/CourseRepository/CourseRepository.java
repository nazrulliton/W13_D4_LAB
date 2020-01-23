package com.codeclan.example.bookSystem.repositories.CourseRepository;

import com.codeclan.example.bookSystem.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findCourseByRating(int rating);
    List<Course> findCourseByBookingsCustomerId(Long id);
}
