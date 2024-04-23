package com.ikanet.level1.repository;

import java.util.Collection;
import java.util.Optional;

import com.ikanet.level1.model.Customer;

public interface CustomerRepositoryInterface {

    public abstract Customer addCustomer(Customer customer);

    public abstract Collection<Customer> viewCustomers();

    public abstract Collection<Customer> removeCustomer(Long id);

    public abstract Customer updateCustomer(Long id, Customer customer);

    public abstract Optional<Customer> findCustomerById(Long id);

}