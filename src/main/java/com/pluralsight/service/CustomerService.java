package com.pluralsight.service;

import com.pluralsight.model.Customer;

import java.util.List;

/**
 * Created by jackson on 17/01/17.
 */
public interface CustomerService {
    List<Customer> findAll();
}
