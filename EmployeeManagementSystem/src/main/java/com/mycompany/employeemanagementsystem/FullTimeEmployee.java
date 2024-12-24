/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeemanagementsystem;

/**
 *
 * @author El-Wattaneya
 */
public class FullTimeEmployee extends Employee {
    
    public FullTimeEmployee(String firstName, String lastName, double salary) {
        super(firstName, lastName, salary);
        this.type = "Full-time"; // نوع الموظف
    }
    

    
    // Builder Design Pattern
     public static class Builder {
        private String firstName;
        private String lastName;
        private double salary;

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setSalary(double salary) {
            this.salary = salary;
            return this;
        }

        public FullTimeEmployee build() {
            return new FullTimeEmployee(firstName, lastName, salary);
        }
    }


}



