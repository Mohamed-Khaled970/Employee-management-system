/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeemanagementsystem;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author El-Wattaneya
 */
public abstract class Employee {
    protected String firstName;
    protected String lastName;
    protected double salaryOrHourlyRate; // راتب أو أجر بالساعة
    protected String type; // نوع الموظف
    // added
    //observer pattern : 
    
    private String status;
    protected  List<Department> departments = new ArrayList<>();

    public Employee(String firstName, String lastName, double salaryOrHourlyRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salaryOrHourlyRate = salaryOrHourlyRate;
    }
      public Employee(String name) {
        this.firstName = name;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalaryOrHourlyRate() {
        return salaryOrHourlyRate;
    }

    public String getType() {
        return type;
    }
    
    
    
    // added 
    // observer pattern
     public void addObserver(Department department) {
        departments.add(department);
    }

    public void removeObserver(Department department) {
        departments.remove(department);
    }
/*
    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }

    public String getStatus() {
        return status;
    }

    private void notifyObservers() {
        for (Department department : departments) {
            department.update(name, status);
        }
    }
*/

}
