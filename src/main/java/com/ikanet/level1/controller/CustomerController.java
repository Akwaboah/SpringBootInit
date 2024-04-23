package com.ikanet.level1.controller;

import org.springframework.web.bind.annotation.RestController;

import com.ikanet.level1.model.Customer;
import com.ikanet.level1.service.CustomerService;

import lombok.extern.slf4j.Slf4j;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * CustomerController
 */
@RestController
@Slf4j
public class CustomerController implements CustomerControllerInterface {

    @Autowired
    CustomerService customerService;

    @Value("${spring.application.name:use_hi_by_default}")
    private String application_name;

    @Override
    @PostMapping(value = "/add-customer")
    public ResponseEntity<Customer> AddCustomer(@RequestBody Customer customer) {
        log.info(CustomerController.class + ": Add customer: {}", customer);
        return new ResponseEntity<>(customerService.addCustomer(customer), HttpStatus.CREATED);
    }

    @Override
    @GetMapping(value = "/customers")
    public ResponseEntity<Collection<Customer>> ViewCustomers() {
        log.info(CustomerController.class + ": Get all customers record");
        return new ResponseEntity<>(customerService.getAllCustomers(), HttpStatus.OK);
    }

    @Override
    @GetMapping(value = "/search-customer")
    public ResponseEntity<Optional<Customer>> FindCustomerById(@RequestParam("id") Long id) {
        log.info(CustomerController.class + ":Searching customers with ID: {}", id);
        return new ResponseEntity<>(customerService.findCustomerById(id), HttpStatus.OK);
    }

    @Override
    @PutMapping(value = "/update-customer")
    public ResponseEntity<Customer> UpdateCustomer(@RequestParam("id") Long id, @RequestBody Customer customer) {
        log.info(CustomerController.class + ":Updating customers with ID: {}, Data: {}", id, customer);
        return new ResponseEntity<>(customerService.updateCustomer(id, customer), HttpStatus.OK);
    }

    @Override
    @DeleteMapping("delete-customer")
    public ResponseEntity<Collection<Customer>> DeleteCustomer(@RequestParam("id") Long id) {
        log.info(CustomerController.class + ":Deleting customers with ID: {}", id);
        return new ResponseEntity<>(customerService.deleteCustomer(id), HttpStatus.OK);
    }

}