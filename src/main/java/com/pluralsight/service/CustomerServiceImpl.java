package com.pluralsight.service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jackson on 17/01/17.
 */
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    //@Autowired // Member level injection
    private CustomerRepository customerRepository;

    @Autowired //Injection in a constructor
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        System.out.println("We are using constructor injection");
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    //@Autowired // Injection in set method
    public void setCustomerRepository(CustomerRepository customerRepository) {
        System.out.println("We are using setting injection");
        this.customerRepository = customerRepository;
    }
}
