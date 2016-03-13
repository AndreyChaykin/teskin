package com.DreamShop.controllers;

import com.DreamShop.model.CustomersAddresses;
import com.DreamShop.repository.CustAddresRepo;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Kyza on 13.03.2016.
 */
@RestController
@RequestMapping(value = "/address")
public class AddressController {

    @Resource
    private CustAddresRepo custAddresRepo;

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Iterable<CustomersAddresses>> getAllAddress(){
        Iterable<CustomersAddresses> allAddress = custAddresRepo.findAll();
        return new ResponseEntity<>(allAddress, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CustomersAddresses> getSingleAddress(@PathVariable("id") Integer id){
        CustomersAddresses customersAddresses = custAddresRepo.findOne(id);
        if(customersAddresses != null){
            return new ResponseEntity<>(customersAddresses, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}
