package com.example.employee_backend.controller;

import com.example.employee_backend.dao.EmployeeDao;
import com.example.employee_backend.model.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class EmployeeController {
    @Autowired
    private EmployeeDao dao;
    @CrossOrigin(origins = "*")
    @PostMapping("/")
    public String Welcomepage()
    {
        return "Welcome to Employee website";
    }

    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")

    public String Addemployee(@RequestBody Employees e){
        System.out.println(e.getEmpcode().toString());
        System.out.println(e.getEmpname().toString());
        System.out.println(e.getDesignation().toString());
        System.out.println(e.getSalary());
        System.out.println(e.getCompanyname().toString());
        System.out.println(e.getMobno().toString());
        System.out.println(e.getUsername().toString());
        System.out.println(e.getPassword().toString());
        dao.save(e);
        return "Employees added successfully";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Employees> viewAll(){
        return (List<Employees>) dao.findAll();
    }













}
