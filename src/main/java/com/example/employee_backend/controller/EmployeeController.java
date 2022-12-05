package com.example.employee_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmployeeController {
    @PostMapping("/")
    public String Welcomepage()
    {
        return "Welcome to Employee website";
    }

    @PostMapping("/add")
    public String Addemployee()
    {
        return "Employee add page";
    }


    @PostMapping("/search")
    public String Searchmployee()
    {
        return "Employee search page";
    }



    @PostMapping("/edit")
    public String Editmployee()
    {
        return "Employee edit page";
    }



    @GetMapping("/view")
    public String Viewmployee()
    {
        return "View all Employees";
    }


    @PostMapping("/delete")
    public String Deletemployee()
    {
        return "Delete Employee";
    }








}
