package com.accolite.au.demo.controller.Employee;

import com.accolite.au.demo.beans.Employee;
import com.accolite.au.demo.service.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class Controller {
    @Autowired
    EmployeeServices service;




    @GetMapping("/IT")
    public List<Employee> getIT()
    {
        return service.getITDepartment();


    }
}
