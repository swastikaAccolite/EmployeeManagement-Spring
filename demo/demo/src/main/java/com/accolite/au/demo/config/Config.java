package com.accolite.au.demo.config;

import com.accolite.au.demo.beans.Department;
import com.accolite.au.demo.beans.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages={"com.accolite.au.demo.beans","com.accolite.au.demo.service","com.accolite.au.demo.controller.Employee"})
public class Config
{
    @Bean("Sudarshan")
    public Department department1(){
        return new Department("Sudarshan","IT");
    }
    @Bean("Arvind")
    public Department department2(){
        return new Department("Arvind","HR");
    }
    @Bean("Jonny")
    public Department department3(){
        return new Department("Jonny","Sales");
    }
    @Bean("Shanaya")
    public Department department4(){
        return new Department("Shanaya","Marketing");
    }


    @Bean("Abby")
    public Employee employee1(){return new Employee(1,department1(),"Abby",22,10000);}
    @Bean("Anshu")
    public Employee employee2(){return new Employee(2,department1(),"Anshu",35,15000);}
    @Bean("Payal")
    public Employee employee3(){return new Employee(3,department1(),"Payal",27,20000);}
    @Bean("Palak")
    public Employee employee4(){return new Employee(4,department2(),"Palak",28,15800);}
    @Bean("Param")
    public Employee employee5(){return new Employee(5,department2(),"Param",33,17000);}
    @Bean("Ashu")
    public Employee employee6(){return new Employee(6,department3(),"Ashu",40,25000);}
    @Bean("Ravi")
    public Employee employee7(){return new Employee(7,department4(),"Ravi",39,30000);}



}
