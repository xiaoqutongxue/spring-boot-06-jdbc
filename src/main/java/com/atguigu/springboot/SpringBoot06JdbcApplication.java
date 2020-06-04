package com.atguigu.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class SpringBoot06JdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot06JdbcApplication.class, args);
    }

}
