/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeemanagementsystem;

/**
 *
 * @author El-Wattaneya
 */
public class FinanceDepartment implements Department {

    @Override
    public void displayDepartmentInfo() {
        System.out.println("This is the Finance Department, responsible for financial operations.");
    }
    
    // added
    //observer pattern
        @Override
    public void update(String employeeName, String status) {
        System.out.println("Finance Department notified: " + employeeName + " is now " + status);
    }

}
