package com.bachelor.bachelorbackend.controller;


import employee.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping
    public ArrayList<JSONObject> test() {
        return employeeService.getEmployees();
    }
}
