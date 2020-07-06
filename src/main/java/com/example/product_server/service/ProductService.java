package com.example.product_server.service;

import com.example.product_server.entity.Product;
import com.example.product_server.jpa.ProductJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductJpa productJpa;

    public Optional<Product> get(int id){
        return productJpa.findById(id);
    }

    public List<Product> findall(){
        return productJpa.findAll();
    }

    public Product findByNameAndPrice(String name,int price){
        return productJpa.findByNameAndPrice(name,price);
    }
}
