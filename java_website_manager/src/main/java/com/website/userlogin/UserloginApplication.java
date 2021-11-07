package com.website.userlogin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.website.userlogin.mapper")
@SpringBootApplication
public class UserloginApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserloginApplication.class, args);
    }
}
