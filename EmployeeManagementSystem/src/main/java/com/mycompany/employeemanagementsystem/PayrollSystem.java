/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeemanagementsystem;

/**
 *
 * @author El-Wattaneya
 */

// Singletone Design Pattern
public class PayrollSystem {
    // إنشاء متغير ثابت يحتوي على الكائن الوحيد من هذا الكلاس
    private static PayrollSystem instance;

    // منع إنشاء مثيل من الكلاس من الخارج (private constructor)
    private PayrollSystem() {}

    // دالة ثابتة لإرجاع الكائن الوحيد
    public static PayrollSystem getInstance() {
        if (instance == null) {
            instance = new PayrollSystem();
        }
        return instance;
    }

    // دالة لحساب راتب الموظف بناءً على النوع
    public double calculateSalary(Employee employee) {
        double salary = 0;
        switch (employee.getType()) {
            case "Full-time":
                // Strategy Desing Pattern
                salary = new FullTimeSalaryCalculationStrategy().calculateSalary(employee);   // راتب ثابت للموظف بدوام كامل
                break;
            case "Part-time":
                // Strategy Desing Pattern
                salary = new PartTimeSalaryCalculationStrategy ().calculateSalary(employee); // راتب جزئي
                break;
            case "Hourly":
                // Strategy Desing Pattern
                salary = new HourlySalaryCalculationStrategy().calculateSalary(employee); // راتب بالساعة
                break;
            default:
                System.out.println("Unknown employee type");
        }
        return salary;
    }
}