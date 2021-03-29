package com.sqltest.service;

import com.sqltest.entity.Product;
import com.sqltest.entity.Vendor;

import java.util.List;

/**
 * @ClassName VendorService
 * @Description TODO
 * @Author .abbeyleix
 * @Date 2021/3/21 0021 下午 18:34
 * @Version 1.0
 **/
public interface ProductService {

    List<String> findProdNames();

    List<Product> findAll();

    List<String> findColumns(String column);

    List<Product> findProductByLimit(int startIndex,int pageSize);

    List<Product> selectProductFetchVendor(String prodId);
}
