package com.service;

import com.DreamShop.model.Customers;
import com.DreamShop.model.CustomersAddresses;
import com.DreamShop.services.CustAddresService;
import com.config.TestDataConfig;
import com.utill.CustAddressUtill;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

/**
 * Created by Kyza on 12.03.2016.
 */
@DirtiesContext
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestDataConfig.class)
@WebAppConfiguration
public class CustAdres {
    @Resource
    private EntityManagerFactory emf;
    protected EntityManager em;

    @Resource
    CustAddresService custAddresService;

//    @Test
//    public void testSaveCity() throws Exception {
//        custAddresService.addCustomersAddress(CustAddressUtill.createCustomerAddress());
//        System.out.println(custAddresService.getAll());
//    }

    @Test
    public void getAddress() throws Exception {
        List<CustomersAddresses> customersAddresses = custAddresService.getAll();
        CustomersAddresses customersAddresses1 = customersAddresses.get(0);
        Customers customers = customersAddresses1.getCustomers();

        System.out.println(customers);
        System.out.println();
        System.out.println();
    }
}

