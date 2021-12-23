package com.rios.testcontainers.service;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

import java.util.List;

import com.rios.testcontainers.model.Customer;
import com.rios.testcontainers.repository.CustomerRepository;

@Service
@AllArgsConstructor
public class CustomerService {
    private CustomerRepository customerRepository;

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
