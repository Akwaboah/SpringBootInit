package com.ikanet.level1.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ikanet.level1.model.Customer;
import com.ikanet.level1.repository.CustomerRepositoryImpl;

/**
 * CustomerRepository
 */
@Service
public class CustomerService {

    @Autowired
    private CustomerRepositoryImpl customerRepository;

    public Collection<Customer> getAllCustomers() {
        return customerRepository.viewCustomers();
    }

    public Customer addCustomer(Customer customer) {
        return customerRepository.addCustomer(customer);
    }

    public Customer updateCustomer(Long id, Customer customer) {
        return customerRepository.updateCustomer(id, customer);
    }

    public Collection<Customer> deleteCustomer(Long id) {
        return customerRepository.removeCustomer(id);
    }

    public Optional<Customer> findCustomerById(Long id) {
        return customerRepository.findCustomerById(id);
    }

}
