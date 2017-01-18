package com.pluralsight;

import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.repository.HibernateCustomerRepositoryImpl;
import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jackson on 18/01/17.
 */
@Configuration
@ComponentScan(basePackages = "com.pluralsight")
public class AppConfig {

//    @Bean(name = "customerRepository")
//    public CustomerRepository getCustomerRepository() {
//        return new HibernateCustomerRepositoryImpl();
//    }
//
//    @Bean(name = "customerService")
//    public CustomerService getCustomerService() {
////        CustomerServiceImpl customerService = new CustomerServiceImpl(getCustomerRepository());
//
//        //Setter injection
////        customerService.setCustomerRepository(getCustomerRepository());
//
//        return new CustomerServiceImpl();
//    }
}
