package com.pluralsight.repository;

import com.pluralsight.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jackson on 17/01/17.
 */
@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Override
    public List<Customer> findAll() {
        Customer customer = new Customer();
        customer.setFirstName("Jackson");
        customer.setLastName("Coelho");

        List<Customer> customers = new ArrayList<>();
        customers.add(customer);

        return customers;
    }
}
