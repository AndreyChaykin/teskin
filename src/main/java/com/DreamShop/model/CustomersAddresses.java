package com.DreamShop.model;

import org.hibernate.annotations.GenericGenerator;


import javax.persistence.*;

/**
 * Created by Kyza on 10.03.2016.
 */
@Entity
@Table(name = "address")
public class CustomersAddresses {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id", length = 6, nullable = false)
    private int id;

    @Column(name = "postal_code")
    private int postalCode;

    @Column(name = "street")
    private String street;

    @Column(name = "house")
    private int house;

    @Column(name = "flat")
    private int flat;

//    @OneToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @OneToOne
    @JoinColumn(name = "customers_id")
    private Customers customers;

    public CustomersAddresses() {
    }

    public CustomersAddresses(int postalCode, String street, int house, int flat) {
        this.postalCode = postalCode;
        this.street = street;
        this.house = house;
        this.flat = flat;
    }

    public Customers getCustomers() {
        return customers;
    }

    public void setCustomers(Customers customers) {
        this.customers = customers;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public int getFlat() {
        return flat;
    }

    public void setFlat(int flat) {
        this.flat = flat;
    }

    @Override
    public String toString() {
        return "CustomersAddresses{" +
                "id=" + id +
                ", postalCode=" + postalCode +
                ", street='" + street + '\'' +
                ", house=" + house +
                ", flat=" + flat +
                '}';
    }


}
