package com.VRDubs.demos.Day10SpringBootJPACRUD.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "employee")
public class User {
    @Id
    @Column(name = "id")
    double id;
    @Column(name = "name")
    String name;
    @Column(name = "salary")
    double salary;


    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public User(double id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public User(){

    }
}
