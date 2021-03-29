package com.sqltest.mapper;

import com.sqltest.entity.Product;
import com.sqltest.entity.Vendor;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @ClassName VendorMapper
 * @Description TODO
 * @Author .abbeyleix
 * @Date 2021/3/21 0021 下午 18:26
 * @Version 1.0
 **/
public interface ProductMapper {

    @Select("SELECT prod_name FROM `products`")
    List<String> findProdNames();

    @Select("SELECT * FROM `products`")
    List<Product> findAll();

    List<String> findColumns(String column);

    List<Product> findProductByLimit(@Param("startIndex") int startIndex,
                                     @Param("pageSize") int pageSize);

    //多对一
    List<Product> selectProductFetchVendor(String prodId);


}
