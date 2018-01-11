package com.example.repositories;

import com.example.models.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CustomerRepository extends CrudRepository<Customer, Integer>{
    Customer findByMobileNumber(String mobileNumber);
}
