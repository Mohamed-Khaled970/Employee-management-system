/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeemanagementsystem;

/**
 *
 * @author El-Wattaneya
 */
// Strategy Desing Pattern
public class HourlySalaryCalculationStrategy implements SalaryCalculationStrategy {
    @Override
    public double calculateSalary(Employee employee) {
        // حساب الراتب بناءً على الأجر بالساعة وعدد الساعات
        return employee.getSalaryOrHourlyRate() * ((HourlyEmployee) employee).getHoursWorked();
    }
}

