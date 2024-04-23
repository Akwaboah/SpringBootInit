package com.ikanet.level1.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.ikanet.level1.model.Customer;

/**
 * CustomerRepositoryImpl
 */
@Repository
public class CustomerRepositoryImpl implements CustomerRepositoryInterface {

    private static Map<Long, Customer> customerCollection = new HashMap<>();
    private long id = 1;

    @Override
    public Customer addCustomer(Customer customer) {
        customer.setID(id);
        customerCollection.put(id, customer);
        id += 1;
        return customer;
    }

    @Override
    public Collection<Customer> viewCustomers() {
        return customerCollection.values();
    }

    @Override
    public Collection<Customer> removeCustomer(Long id) {
        customerCollection.remove(id);
        return customerCollection.values();
    }

    @Override
    public Customer updateCustomer(Long id, Customer customer) {
        customerCollection.remove(id);
        customer.setID(id);
        customerCollection.put(id, customer);
        return customer;
    }

    @Override
    public Optional<Customer> findCustomerById(Long id) {
        return customerCollection.values().stream().filter(customer -> customer.getID().equals(id)).findFirst();
    }

}