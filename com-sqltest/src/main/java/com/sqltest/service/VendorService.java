package com.sqltest.service;

import com.sqltest.entity.Vendor;

import java.util.List;

/**
 * @ClassName VendorService
 * @Description TODO
 * @Author .abbeyleix
 * @Date 2021/3/21 0021 下午 18:34
 * @Version 1.0
 **/
public interface VendorService {

    List<Vendor> findAll();

    Vendor getVendor(int vendId);
}
