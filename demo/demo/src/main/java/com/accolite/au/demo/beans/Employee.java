package com.accolite.au.demo.beans;
import org.springframework.stereotype.Component;
public class Employee
{
    Integer id;
    Department department;
    String name;
    Integer age;
    double salary;

    public Employee(Integer id, Department department,String name, Integer age, double salary)
    {
        super();
        this.id=id;
        this.department=department;
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    public int getId()
    {
        return id;
    }
    public void setId(Integer id)
    {
        this.id=id;
    }
    public Department getDepartment()
    {
        return department;
    }
    public void setDepartment(Department department)
    {
        this.department=department;
    }
    public String getName()
    {
        return name;
    }
    public void setName()
    {
        this.name=name;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(Integer age)
    {
        this.age=age;
    }
    public double getSalary()
    {
        return salary;
    }
    public void setSalary(double salary)
    {
        this.salary=salary;
    }

    @Override
    public String toString(){
        return "Employee [id=" +id+ ", Department=" +department+ ", Name= "+name+ "Age= "+age+ "Salary =" +salary+ "]";

    }



}
