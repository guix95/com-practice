package com.sqltest.entity;

import lombok.Data;

import java.util.List;


/**
 * @ClassName Vendor
 * @Description TODO
 * @Author .abbeyleix
 * @Date 2021/3/20 0020 下午 16:02
 * @Version 1.0
 **/

@Data
public class Vendor{

    private Long vendId;
    private String vendName;
    private String vendAddress;
    private String vendCity;
    private String vendState;
    private String vendZip;
    private String vendCountry;

    private List<Product> products;

}
