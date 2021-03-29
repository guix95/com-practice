package com.sqltest.controller;

import com.sqltest.entity.Product;
import com.sqltest.entity.Vendor;
import com.sqltest.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName ProductController
 * @Description TODO
 * @Author .abbeyleix
 * @Date 2021/3/22 0022 下午 16:25
 * @Version 1.0
 **/
@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/findProdNames")
    public List<String> findProdNames(){
        return productService.findProdNames();
    }
    @RequestMapping("/findAll")
    public List<Product> findAll(){
        return productService.findAll();
    }

    @PostMapping("/findColumns")
    public List<String> findColumns(@RequestParam("column") String column){
        if ("".equals(column.trim())&&column == null){
            System.out.println("column = null");
        }
        return productService.findColumns(column);
    }
    @RequestMapping("/findProductByLimit")
    public List<Product> findProductByLimit(@RequestParam(value = "startIndex" , required = false,defaultValue = "0") String startIndex,
                                  @RequestParam(value = "pageSize" ,required = false ,defaultValue = "5")String pageSize){

        return productService.findProductByLimit(Integer.parseInt(startIndex),Integer.parseInt(pageSize));
    }

    @PostMapping("/selectProductFetchVendor")
    public List<Product> selectProductFetchVendor(@RequestParam("prodId") String prodId){
        return productService.selectProductFetchVendor(prodId);
    }
}
