package com.bachelor.bachelorbackend;

import ch.qos.logback.classic.BasicConfigurator;
import employee.service.EmployeeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication(scanBasePackageClasses = {EmployeeService.class}, exclude = MongoAutoConfiguration.class)
public class BachelorBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BachelorBackendApplication.class, args);
    }

}
