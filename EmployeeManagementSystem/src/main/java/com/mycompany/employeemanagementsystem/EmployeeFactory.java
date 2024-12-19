/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeemanagementsystem;

/**
 *
 * @author El-Wattaneya
 */

// Factory Design Pattern
public class EmployeeFactory {

  public static Employee createEmployee(String type, String firstName, String lastName, double salaryOrHourlyRate, int hoursWorked) {
        switch (type) {
            case "Full Time Employee":
                return new FullTimeEmployee.Builder()
                        .setFirstName(firstName)
                        .setLastName(lastName)
                        .setSalary(salaryOrHourlyRate)
                        .build(); // إنشاء موظف بدوام كامل باستخدام Builder
                
            case "Part Time Employee":
                return new PartTimeEmployee.Builder()
                        .setFirstName(firstName)
                        .setLastName(lastName)
                        .setHourlyRate(salaryOrHourlyRate)
                        .setHoursWorked(hoursWorked)
                        .build(); // إنشاء موظف بدوام جزئي باستخدام Builder
                
            case "Hourly Employee":
                return new HourlyEmployee.Builder()
                        .setFirstName(firstName)
                        .setLastName(lastName)
                        .setHourlyRate(salaryOrHourlyRate)
                        .setHoursWorked(hoursWorked)
                        .build(); // إنشاء موظف بأجر بالساعة باستخدام Builder
                
            default:
                throw new IllegalArgumentException("Unknown employee type: " + type);
        }
    }
}
