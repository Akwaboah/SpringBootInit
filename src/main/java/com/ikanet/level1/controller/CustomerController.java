package com.ikanet.level1.controller;

import org.springframework.web.bind.annotation.RestController;
import com.ikanet.level1.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * Customer
 */
@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @RequestMapping(value = "/")
    public String home() {
        return "<html> <h4>"+customerService.sayHi()+" by making a request from CustomerController </h4></html>";
    }
    
}