package com.ikanet.level1.controller;

import java.util.Collection;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.ikanet.level1.model.Customer;

public interface CustomerControllerInterface {

    public abstract ResponseEntity<Customer> AddCustomer(@RequestBody Customer customer);

    public abstract ResponseEntity<Collection<Customer>> ViewCustomers();

    public abstract ResponseEntity<Optional<Customer>> FindCustomerById(@RequestParam("id") Long id);

    public abstract ResponseEntity<Collection<Customer>> DeleteCustomer(@RequestParam("id") Long id);

    public abstract ResponseEntity<Customer> UpdateCustomer(@RequestParam("id") Long id, @RequestBody Customer customer);

}
