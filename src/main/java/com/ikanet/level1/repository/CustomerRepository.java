package com.ikanet.level1.repository;

import org.springframework.stereotype.Repository;
/**
 * CustomerRepository
 */
@Repository
public class CustomerRepository {

    public String getMessage(){
        return "I'm a CustomerRepository";
    }
    
}