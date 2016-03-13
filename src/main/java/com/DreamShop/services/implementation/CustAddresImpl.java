package com.DreamShop.services.implementation;


import com.DreamShop.model.CustomersAddresses;
import com.DreamShop.repository.CustAddresRepo;

import com.DreamShop.services.CustAddresService;
import com.DreamShop.services.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by Kyza on 12.03.2016.
 */
@Service
public class CustAddresImpl implements CustAddresService {

    @Autowired
    CustAddresRepo custAddresRepo;


    @Override
    public List<CustomersAddresses> getAll() {
        return custAddresRepo.findAll();
    }

    @Override
    public CustomersAddresses addCustomersAddress(CustomersAddresses customersAddresses) {
        return custAddresRepo.saveAndFlush(customersAddresses);
    }

}
