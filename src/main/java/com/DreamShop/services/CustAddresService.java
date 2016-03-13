package com.DreamShop.services;

import com.DreamShop.model.Customers;
import com.DreamShop.model.CustomersAddresses;

import java.util.List;

/**
 * Created by Kyza on 12.03.2016.
 */
public interface CustAddresService {
    List<CustomersAddresses> getAll();
    CustomersAddresses addCustomersAddress(CustomersAddresses customersAddresses);

}
