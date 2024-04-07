package com.ikanet.level1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ikanet.level1.repository.CustomerRepository;
/**
 * CustomerRepository
 */
@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public String sayHi(){
        return customerRepository.getMessage()+ ", am glad CustomerService used me.";
    }
}
