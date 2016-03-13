package com.utill;

import com.DreamShop.model.CustomersAddresses;

/**
 * Created by Kyza on 12.03.2016.
 */
public class CustAddressUtill {
    public static CustomersAddresses createCustomerAddress(){
        CustomersAddresses customersAddresses  = new CustomersAddresses();
        customersAddresses.setFlat(1);
        customersAddresses.setHouse(1);
        customersAddresses.setId(1);
        customersAddresses.setPostalCode(1);
        customersAddresses.setStreet("1");
        return customersAddresses;
    }
}
