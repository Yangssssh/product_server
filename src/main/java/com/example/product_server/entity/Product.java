package com.example.product_server.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name="ysh_product")
public class Product implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    private int price;

    private int store;

}
