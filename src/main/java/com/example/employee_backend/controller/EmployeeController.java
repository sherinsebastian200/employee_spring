package com.example.employee_backend.controller;

import com.example.employee_backend.model.Employees;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmployeeController {
    @PostMapping("/")
    public String Welcomepage()
    {
        return "Welcome to Employee website";
    }

    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")

    public String Addemployee(@RequestBody Employees e){
        System.out.println(e.getEmpname().toString());
        return "Employees added successfully";
    }











}
