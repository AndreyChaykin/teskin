package com.DreamShop.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Kyza on 10.03.2016.
 */
@Entity
@Table(name = "items")
public class ItemsSKU {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id", length = 6, nullable = false)
    private int id;

    @Column(name = "price")
    private int price;

    @Column(name = "amount_items")
    private int amountItems;


    @Column(name = "name")
    private String nameItems;


    public ItemsSKU() {
    }

    public ItemsSKU(int price, int itemsInStock, String nameItems) {
        this.price = price;
        this.amountItems = itemsInStock;
        this.nameItems = nameItems;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmountItems() {
        return amountItems;
    }

    public void setAmountItems(int amountItems) {
        this.amountItems = amountItems;
    }

    public String getNameItems() {
        return nameItems;
    }

    public void setNameItems(String nameItems) {
        this.nameItems = nameItems;
    }

    @Override
    public String toString() {
        return "ItemsSKU{" +
                "id=" + id +
                ", price=" + price +
                ", amountItems=" + amountItems +
                ", nameItems='" + nameItems + '\'' +
                '}';
    }

}
