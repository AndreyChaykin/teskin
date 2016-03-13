package com.DreamShop.controllers;

import com.DreamShop.model.Customers;
import com.DreamShop.repository.CustomersRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Kyza on 12.03.2016.
 */

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Resource
    private CustomersRepository customersRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Iterable<Customers>> getAllCustomers(){
        Iterable<Customers> allCustomers = customersRepository.findAll();
        return new ResponseEntity<>(allCustomers, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Customers> getSingleCustomerItem(@PathVariable("id") Integer id){
        Customers customers = customersRepository.findOne(id);
        if(customers != null){
            return new ResponseEntity<>(customers, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}
