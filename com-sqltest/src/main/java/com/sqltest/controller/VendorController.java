package com.sqltest.controller;

import com.sqltest.entity.Vendor;
import com.sqltest.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName VendorController
 * @Description TODO
 * @Author .abbeyleix
 * @Date 2021/3/21 0021 下午 18:38
 * @Version 1.0
 **/
@RestController
@RequestMapping("/vendor")
public class VendorController {
    @Autowired
    private VendorService vendorService;

    @RequestMapping("/findAll")
    public List<Vendor> findAll(){
        return vendorService.findAll();
    }

    @PostMapping("/getVendor")
    public Vendor getVendor(@RequestParam("vend_id")int vendId){
        return vendorService.getVendor(vendId);
    }
}
