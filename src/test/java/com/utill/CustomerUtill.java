package com.utill;

import com.DreamShop.model.Customers;

/**
 * Created by Kyza on 12.03.2016.
 */
public class CustomerUtill {
    public static Customers createCustomers(){
        Customers customers = new Customers();
        customers.setEmail("Andrey@gmail.com");
        customers.setId(1);
        customers.setAvaibleCredit(2000);
        customers.setName("Andrey");

        return customers;
    }
}
