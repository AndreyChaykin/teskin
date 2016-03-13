package com.DreamShop.services.implementation;

import com.DreamShop.model.Customers;
import com.DreamShop.model.Orders;
import com.DreamShop.repository.CustomersRepository;
import com.DreamShop.services.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Kyza on 12.03.2016.
 */
@Service
public class CustomersImpl implements CustomersService {

    @Autowired
    CustomersRepository customersRepository;


    @Override
    public List<Customers> getAll() {
        return customersRepository.findAll();
    }

    @Override
    public Customers addCustomers(Customers customers) {
        return customersRepository.saveAndFlush(customers);
    }

    private OrdersImpl orderimpl;

    //показать Заказ
    public void showOrders() {
        System.out.println("Ваш заказ: ");
        orderimpl.showOrder();
    }

    //оплатить Заказ
    public void pay() {
        if(orderimpl.isPayment() == true) {
            System.out.println("Вы уже оплатили заказ");
        } else {
            orderimpl.setPayment(true);
        }
    }

    //Забрать товар
    public void take() {
        if(orderimpl.isPayment() == false) {
            System.out.println("Вы ещё не оплатили товар");
                } else {
            System.out.println("Спасибо за покупку!");
        }
    }
}
