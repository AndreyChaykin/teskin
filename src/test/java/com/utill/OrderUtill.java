package com.utill;

import com.DreamShop.model.Customers;
import com.DreamShop.model.Orders;

/**
 * Created by Kyza on 12.03.2016.
 */
public class OrderUtill {
    public static Orders createOrders(){
        Orders orders = new Orders();
        orders.setId(1);

        return orders;
    }
}
