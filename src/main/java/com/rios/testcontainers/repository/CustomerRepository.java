package com.rios.testcontainers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rios.testcontainers.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
