package com.example.services;

import com.example.models.Customer;
import com.example.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer getDetails(int id) {
        return customerRepository.findOne(id);
    }

    public int addCustomer(Customer customer) {
        Customer returnedCustomer = customerRepository.save(customer);
        return returnedCustomer.getCid();
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
