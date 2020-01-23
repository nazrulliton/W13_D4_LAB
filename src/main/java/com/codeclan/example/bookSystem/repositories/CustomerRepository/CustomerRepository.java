package com.codeclan.example.bookSystem.repositories.CustomerRepository;

import com.codeclan.example.bookSystem.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom {
}
