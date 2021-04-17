package com.bachelor.bachelorbackend.controller;


import com.bachelor.bachelorbl.employee.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("test")
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping
    public String test() {
//        employeeService.getEmployees();
        return "AAASA";
    }
}
