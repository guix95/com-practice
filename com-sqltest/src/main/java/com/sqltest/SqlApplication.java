package com.sqltest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @ClassName SqlApplication
 * @Description TODO
 * @Author .abbeyleix
 * @Date 2021/3/20 0020 下午 15:41
 * @Version 1.0
 **/
@SpringBootApplication
@MapperScan("com.sqltest.mapper")
public class SqlApplication {
    public static void main(String[] args) {
        SpringApplication.run(SqlApplication.class);
    }
}
