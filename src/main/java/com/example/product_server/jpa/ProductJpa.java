package com.example.product_server.jpa;

import com.example.product_server.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductJpa extends JpaRepository<Product,Integer> {

     /**
      * create by: Y.sh
      * create time: 2020/5/20 17:59
      * description:
      */
    Product findByNameAndPrice(String name,int price);
}
