package com.accolite.au.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class EmployeeRepo {
    Employee Abby;
   Employee Payal;
    Employee Ashu;
    Employee Param;
    Employee Anshu;
    public Employee getAbby()
    {
        return Abby;
    }
    @Autowired
    @Qualifier("Abby")
    public void setAbby(Employee Abby)
    {
        this.Abby=Abby;
    }
    public Employee getPayal()
    {
        return Payal;
    }
    @Autowired
    @Qualifier("Payal")
    public void setAPayal(Employee Payal)
    {
        this.Payal=Payal;
    }

    public Employee getAshu() {
        return Ashu;
    }
    @Autowired
    @Qualifier("Ashu")
    public void setAshu(Employee Ashu) {
        this.Ashu = Ashu;
    }
    public Employee getParam() {
        return Param;
    }
    @Autowired
    @Qualifier("Param")
    public void setParam(Employee Param) {
        this.Param = Param;
    }
    public Employee getAnshu() {
        return Anshu;
    }
    @Autowired
    @Qualifier("Anshu")
    public void setAnshu(Employee Anshu) {
        this.Anshu = Anshu;
    }

}
