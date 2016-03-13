package com.service;

import com.DreamShop.services.OrdersService;
import com.config.TestDataConfig;
import com.utill.OrderUtill;
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
public class OrdersServicess {
    @Resource
    private EntityManagerFactory emf;
    protected EntityManager em;

    @Resource
    private OrdersService ordersService;

    @Test
    public void testSaveCity() throws Exception {
        ordersService.addOrders(OrderUtill.createOrders());
        System.out.println(ordersService.getAll());
    }

}
