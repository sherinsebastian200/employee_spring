package com.example.employee_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmployeeController {
    @GetMapping("/")
    public String Welcomepage()
    {
        return "Welcome to Employee website";
    }

    @GetMapping("/add")
    public String Addemployee()
    {
        return "Employee add page";
    }


    @GetMapping("/search")
    public String Searchmployee()
    {
        return "Employee search page";
    }



    @GetMapping("/edit")
    public String Editmployee()
    {
        return "Employee edit page";
    }



    @GetMapping("/view")
    public String Viewmployee()
    {
        return "View all Employees";
    }








}
