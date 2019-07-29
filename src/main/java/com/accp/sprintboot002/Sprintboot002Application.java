package com.accp.sprintboot002;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.accp.sprintboot002.dao")
public class Sprintboot002Application {

    public static void main(String[] args) {
        SpringApplication.run(Sprintboot002Application.class, args);
    }

}
