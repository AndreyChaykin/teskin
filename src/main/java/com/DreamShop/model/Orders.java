package com.DreamShop.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Kyza on 12.03.2016.
 */
@Entity
@Table(name = "orders")
public class Orders {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id", length = 6, nullable = false)
    private int id;
//
//    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
//    @JoinColumn(name = "item_id")
//    private List<ItemsSKU> itemsSKU;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "FK_orders_customers")
    private Customers customers;

    public Orders() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    public List<ItemsSKU> getItemsSKU() {
//        return itemsSKU;
//    }
//
//    public void setItemsSKU(List<ItemsSKU> itemsSKU) {
//        this.itemsSKU = itemsSKU;
//    }

    public Customers getCustomers() {
        return customers;
    }

    public void setCustomers(Customers customers) {
        this.customers = customers;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
//                ", itemsSKU=" + itemsSKU +
                ", customers=" + customers +
                '}';
    }

}
