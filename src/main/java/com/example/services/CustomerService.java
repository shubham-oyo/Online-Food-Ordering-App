package com.example.services;

import com.example.models.Customer;
import com.example.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer getDetails(int id) {
        return customerRepository.findOne(id);
    }

    public Customer addCustomer(Customer customer) {
        Customer returnedCustomer = customerRepository.findByMobileNumber(customer.getMobileNumber());
//        System.out.println(returnedCustomer.__class__.__name__);
//        System.out.println(type(returnedCustomer));
        if (returnedCustomer != null) {
            returnedCustomer.setMessage("Customer with same mobile number already exists");
            return returnedCustomer;
        }
        else {
            returnedCustomer = customerRepository.save(customer);
            returnedCustomer.setMessage("Successfully signed up");
            return returnedCustomer;
        }
    }

    public List<Customer> getAllCustomers() {
        return (List<Customer>) customerRepository.findAll();
    }

    public String deleteCustomer(int id) {
        try {
            customerRepository.delete(id);
            return "Successfully deleted customer";
        }
        catch(IllegalArgumentException e){
            return "Error deleting customer. Customer id does not exist";
        }
    }
}
