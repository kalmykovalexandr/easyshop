package com.easyshop.user_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.easyshop")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}