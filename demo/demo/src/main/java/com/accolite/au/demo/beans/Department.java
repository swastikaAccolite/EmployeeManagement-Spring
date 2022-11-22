package com.accolite.au.demo.beans;

public class Department {
    String head;
    String project;

    public Department(String head,String project)
    {

        this.head=head;
        this.project=project;
    }
    public String getHead()
    {
        return head;
    }
    public void setHead(String head)
    {
        this.head=head;
    }
    public String getProject(String Project)
    {
        return project;
    }
    public void setProject(String project)
    {
        this.project=project;
    }

    @Override
    public String toString() {
        return "Department{" +
                "head='" + head + '\'' +
                ", project='" + project + '\'' +
                '}';
    }
}
