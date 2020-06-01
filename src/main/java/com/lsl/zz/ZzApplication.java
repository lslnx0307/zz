package com.lsl.zz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.lsl.zz.mapper"})
public class ZzApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZzApplication.class, args);
    }

}
