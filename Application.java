package com.bm.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan(basePackages = "com.bm")
@EnableJpaRepositories(basePackages = {"com.bm.core.dao.repository", "com.bm.dataload.dao.repository"})
@EntityScan(basePackages = {"com.bm.core.dao.entity", "com.bm.dataload.dao.entity"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run (Application.class, args);
    }
}
