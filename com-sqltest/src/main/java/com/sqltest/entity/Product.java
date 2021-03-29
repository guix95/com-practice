package com.sqltest.entity;

import lombok.Data;

/**
 * @ClassName Product
 * @Description TODO
 * @Author .abbeyleix
 * @Date 2021/3/22 0022 下午 16:14
 * @Version 1.0
 **/
@Data
public class Product {
    private String prodId;
//    private int vendId;
    private String prodName;
    private String prodPrice;
    private String prodDesc;

    private Vendor vendor;

}
