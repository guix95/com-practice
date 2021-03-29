package com.sqltest.service.impl;

import com.sqltest.entity.Product;
import com.sqltest.entity.Vendor;
import com.sqltest.mapper.ProductMapper;
import com.sqltest.mapper.VendorMapper;
import com.sqltest.service.ProductService;
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
public class ProductServiceimpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<String> findProdNames() {
        return productMapper.findProdNames();
    }

    @Override
    public List<Product> findAll() {
        return productMapper.findAll();
    }

    @Override
    public List<String> findColumns(String column) {
        return productMapper.findColumns(column);
    }

    @Override
    public List<Product> findProductByLimit(int startIndex,int pageSize) {
        return productMapper.findProductByLimit(startIndex,pageSize);
    }

    @Override
    public List<Product> selectProductFetchVendor(String prodId) {
        return productMapper.selectProductFetchVendor(prodId);
    }
}
