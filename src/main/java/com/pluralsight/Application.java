package com.pluralsight;

import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;

/**
 * Created by jackson on 17/01/17.
 */
public class Application {

    public static void main(String[] args) {
        CustomerService customerService = new CustomerServiceImpl();
        System.out.println(customerService.findAll().get(0).getFirstName());
    }
}
