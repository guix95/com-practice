package com.sqltest.mapper;

import com.sqltest.entity.Vendor;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @ClassName VendorMapper
 * @Description TODO
 * @Author .abbeyleix
 * @Date 2021/3/21 0021 下午 18:26
 * @Version 1.0
 **/

public interface VendorMapper {

    @Select("SELECT * FROM vendors")
    List<Vendor> findAll();

    Vendor getVendor(int vendId);
}
