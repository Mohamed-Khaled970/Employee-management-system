/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeemanagementsystem;

/**
 *
 * @author El-Wattaneya
 */

//Factory Design Pattern
public class DepartmentFactory {

    // دالة تقوم بإنشاء الكائنات حسب نوع القسم
    public Department createDepartment(String departmentType) {
        if (departmentType == null) {
            return null;
        }
        
        if (departmentType.equalsIgnoreCase("HR")) {
            return new HRDepartment();
        } else if (departmentType.equalsIgnoreCase("Finance")) {
            return new FinanceDepartment();
        } else if (departmentType.equalsIgnoreCase("IT")) {
            return new ITDepartment();
        }
        
        return null; // إذا لم يكن القسم موجودًا
    }
}
