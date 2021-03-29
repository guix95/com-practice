package com.sqltest.controller;

import com.sqltest.SqlApplication;
import com.sqltest.entity.Vendor;
import com.sqltest.service.VendorService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SqlApplication.class)
public class VendorControllerTest {
    @Autowired
    private VendorService vendorService;

    @Test
    public void findAll() {
    }

    @Test
    public void getVendor() {
        Vendor vendor = vendorService.getVendor(1001);
        System.out.println("vendor = " + vendor);
    }
}