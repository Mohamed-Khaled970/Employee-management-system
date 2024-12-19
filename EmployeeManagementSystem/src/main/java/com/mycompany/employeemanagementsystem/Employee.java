/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeemanagementsystem;
/**
 *
 * @author El-Wattaneya
 */
public abstract class Employee {
    protected String firstName;
    protected String lastName;
    protected double salaryOrHourlyRate; // راتب أو أجر بالساعة
    protected String type; // نوع الموظف

    public Employee(String firstName, String lastName, double salaryOrHourlyRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salaryOrHourlyRate = salaryOrHourlyRate;
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

}
