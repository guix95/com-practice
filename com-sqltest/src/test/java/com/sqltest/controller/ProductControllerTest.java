package com.sqltest.controller;


import com.sqltest.SqlApplication;
import com.sqltest.entity.Product;
import com.sqltest.entity.Vendor;
import com.sqltest.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SqlApplication.class)
public class ProductControllerTest {
    @Autowired
    private ProductService productService;



    @Test
    public void test1(){
        log.info("Current Time: {}", System.currentTimeMillis());
        log.info("Current Time: " + System.currentTimeMillis());
        log.info("Current Time: {}", System.currentTimeMillis());
        log.trace("trace log");
        log.warn("warn log");
        log.debug("debug log");
        log.info("info log");
        log.error("error log");
    }

    @Test
    public void findProdNames() {
        List<String> prodNames = productService.findProdNames();
        System.out.println(prodNames);
    }
    
    @Test
    public void findAll() {
        List<Product> productList = productService.findAll();
        System.out.println("productList = " + productList);
    }

    @Test
    public void findColumns(){
//        List<String> prod_id = productService.findColumns("prod_id");
//        System.out.println("prod_id = " + prod_id);
        List<String> vend_id = productService.findColumns("vend_id");
        System.out.println("vend_id = " + vend_id);
    }
    @Test
    public void productService(){
        List<Product> products = productService.findProductByLimit(0,5);
        System.out.println("products = " + products);
    }
    @Test
    public void selectProductFetchVendor(){
        List<Product> productList = productService.selectProductFetchVendor("ANV01");
        for (Product product: productList) {
            System.out.println("product = " + product);
        }

    }
}