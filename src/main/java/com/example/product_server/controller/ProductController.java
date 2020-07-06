package com.example.product_server.controller;

import com.example.product_server.entity.Product;
import com.example.product_server.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: Y.sh
 * @date: Created in 2020/5/21 14:11
 * @description:
 */
@RestController
@RequestMapping(value = "product",produces = { "application/json;charset=UTF-8"})
public class ProductController {

    @Value("${server.port}")
    private String port;

    @Autowired
    private ProductService productService;

    @RequestMapping("list")
    public List<Product> findlist(){
        return productService.findall();
    }

    @RequestMapping("get")
    public Product get(int id){
        Product product=productService.get(id).get();
        product.setName(product.getName()+"port ="+port);
        return product;
    }

    @RequestMapping("findByNameAndPrice")
    public Product findByNameAndPrice(String name,int price){
        Product product = productService.findByNameAndPrice(name, price);
        Product result = new Product();
        BeanUtils.copyProperties(product,result);
        result.setName(product.getName()+"port ="+port);
        return result;
    }
}
