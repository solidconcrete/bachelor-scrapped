package com.bachelor.bachelorbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
//exclude = MongoAutoConfiguration.class
@SpringBootApplication(exclude = MongoAutoConfiguration.class)
@ComponentScan({"com.bachelor"})
public class BachelorBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BachelorBackendApplication.class, args);
    }

}
