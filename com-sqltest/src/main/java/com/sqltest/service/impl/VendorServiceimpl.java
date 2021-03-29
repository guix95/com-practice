package com.sqltest.service.impl;

import com.sqltest.entity.Vendor;
import com.sqltest.mapper.VendorMapper;
import com.sqltest.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * @ClassName VendorServiceimpl
 * @Description TODO
 * @Author .abbeyleix
 * @Date 2021/3/21 0021 下午 18:35
 * @Version 1.0
 **/
@Service
public class VendorServiceimpl implements VendorService {

    @Autowired
    private VendorMapper vendorMapper;

    @Override
    public List<Vendor> findAll() {
        return vendorMapper.findAll();
    }

    @Override
    public Vendor getVendor(int vendId) {
        return vendorMapper.getVendor(vendId);
    }
}
