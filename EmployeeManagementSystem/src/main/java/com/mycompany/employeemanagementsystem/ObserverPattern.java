/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeemanagementsystem;

/**
 *
 * @author El-Wattaneya
 */
public class ObserverPattern {
            // Create Employee (Subject)
        FullTimeEmployee employee = new FullTimeEmployee("John","Doe",4000);
         
       
        // Create Observers (Departments)
        Department hr = new HRDepartment();
        Department it = new ITDepartment();
        Department finance = new FinanceDepartment();
        
        
        // Add Observers to the Employee
        
        public void TestObserver()
        {
            employee.addObserver(hr);
            employee.addObserver(it);
            employee.addObserver(finance);

        }
        
    
}
