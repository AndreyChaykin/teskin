package com.DreamShop.services;

import com.DreamShop.model.Orders;

import java.util.List;

/**
 * Created by Kyza on 12.03.2016.
 */
public interface OrdersService {
    List<Orders> getAll();
    Orders addOrders(Orders orders);
    void deleteOrders(int id);

}
