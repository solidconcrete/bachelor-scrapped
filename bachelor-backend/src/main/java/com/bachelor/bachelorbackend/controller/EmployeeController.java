package com.bachelor.bachelorbackend.controller;


import com.bachelor.bachelorbl.employee.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.bson.Document;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RequiredArgsConstructor
@RestController
@RequestMapping("test")
@Slf4j
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping
    public ArrayList<Document> test() {
        return null;
//        return employeeService.getEmployees();
//        return "AAASA";
    }
}
