/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeemanagementsystem;

/**
 *
 * @author El-Wattaneya
 */
public class HRDepartment implements Department {

    @Override
    public void displayDepartmentInfo() {
        System.out.println("This is the HR Department, responsible for employee relations.");
    }
    
    // added
    // Observer Pattern
     @Override
    public void update(String employeeName, String status) {
        System.out.println("HR Department notified: " + employeeName + " is now " + status);
    }

}
