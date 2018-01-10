package com.example.controllers;

import org.springframework.boot.*;
import com.example.models.Customer;
import com.example.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/")
    public String CustomerHome() {
        return "Working";
    }

    @RequestMapping(value="/signup", method=RequestMethod.POST)
    public int addCustomer(@RequestBody Customer customer) {
        return customerService.addCustomer(customer);
    }

    @RequestMapping(value="/{customerId}", method=RequestMethod.GET)
    public Customer getCustomerDetails(@PathVariable int customerId){
        return customerService.getDetails(customerId);
    }

    @RequestMapping(value="/all", method=RequestMethod.GET)
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
    public String deleteCustomer(@PathVariable int id) {
        return customerService.deleteCustomer(id);
    }
//    @RequestMapping(value="/delete", method=RequestMethod.POST, consumes="text/plain")
//    public String deleteCustomer(@RequestBody String id) {
//        return customerService.deleteCustomer(id);
//    }
//    public String deleteCustomer(@RequestBody Map<String, Integer> payload) {
//    @RequestMapping(value="/delete", method=RequestMethod.POST)
//        return customerService.deleteCustomer(payload.id);
//    }
}
