package com.github.customer.customer.controller;

import com.github.customer.customer.model.Customer;
import com.github.customer.customer.repository.CustomerRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("customer")
@CrossOrigin("*")
public class CustomerController {

    private final CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Customer CustomerCreate(@RequestBody Customer customer){
        customerRepository.save(customer);
        return customer;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Customer> Customers() {
        return customerRepository.findAll();
    }


}
