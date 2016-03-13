package com.DreamShop.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Kyza on 10.03.2016.
 */
@Entity
@Table(name = "customers")
public class Customers {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id", length = 6, nullable = false)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "avaible_credit")
    private int avaibleCredit;

    public Customers() {
    }

    public Customers(String name, String email, int avaibleCredit) {
        this.name = name;
        this.email = email;
        this.avaibleCredit = avaibleCredit;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", avaibleCredit=" + avaibleCredit +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAvaibleCredit() {
        return avaibleCredit;
    }

    public void setAvaibleCredit(int avaibleCredit) {
        this.avaibleCredit = avaibleCredit;
    }


}
