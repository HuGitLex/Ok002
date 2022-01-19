package com.okit;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.okit.dao")
public class Ok002Application {

    public static void main(String[] args) {
        SpringApplication.run(Ok002Application.class, args);
    }

}
