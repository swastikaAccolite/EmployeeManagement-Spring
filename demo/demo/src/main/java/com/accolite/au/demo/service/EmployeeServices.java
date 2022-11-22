package com.accolite.au.demo.service;

import com.accolite.au.demo.beans.Employee;
import com.accolite.au.demo.beans.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServices {
    @Autowired
    EmployeeRepo employeerepo;
    public List<Employee> getITDepartment()
    {
        ArrayList<Employee> employee = new ArrayList<>();
        employee.add(employeerepo.getAbby());
        employee.add(employeerepo.getAnshu());
        employee.add(employeerepo.getPayal());
       // employee.add(employeerepo.getParam());

        return employee;

    }

}
