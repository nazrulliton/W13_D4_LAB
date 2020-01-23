package com.codeclan.example.bookSystem.repositories.CourseRepository;

import com.codeclan.example.bookSystem.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {
}
