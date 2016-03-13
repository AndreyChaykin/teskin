package com.service;

import com.DreamShop.services.CustomersService;
import com.config.TestDataConfig;

import com.utill.CustomerUtill;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 * Created by Kyza on 12.03.2016.
 */
@DirtiesContext
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestDataConfig.class)
@WebAppConfiguration
public class CustomerServicesss {
    @Resource
    private EntityManagerFactory emf;
    protected EntityManager em;

    @Resource
    private CustomersService customersService;

    @Test
    public void testSaveCity() throws Exception {
        customersService.addCustomers(CustomerUtill.createCustomers());
        System.out.println(customersService.getAll());
    }
}
