package com.example.projectend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("com.example.projectend.mapper")
@EnableCaching
public class ProjectEndApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectEndApplication.class, args);
    }

}
