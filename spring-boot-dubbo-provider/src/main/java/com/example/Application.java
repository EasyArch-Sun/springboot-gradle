package com.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {

        SpringApplication springApplication = new SpringApplication(Application.class);
        springApplication.setRegisterShutdownHook(false);
        springApplication.run(args);

        // SpringApplication.run(Application.class, args);

    }
}
