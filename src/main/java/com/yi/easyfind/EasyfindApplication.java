package com.yi.easyfind;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yi.easyfind.mapper")
public class EasyfindApplication {

    public static void main(String[] args) {
        SpringApplication.run(EasyfindApplication.class, args);
    }

}
