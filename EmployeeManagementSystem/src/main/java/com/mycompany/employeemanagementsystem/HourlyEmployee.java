/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeemanagementsystem;

/**
 *
 * @author El-Wattaneya
 */
public class HourlyEmployee extends Employee {
    private int hoursWorked;

    public HourlyEmployee(String firstName, String lastName, double hourlyRate, int hoursWorked) {
        super(firstName, lastName, hourlyRate);
        this.hoursWorked = hoursWorked;
        this.type = "Hourly";
    }


    public int getHoursWorked() {
        return hoursWorked;
    }
    
    // Builder Design Pattern
     public static class Builder {
        private String firstName;
        private String lastName;
        private double hourlyRate;
        private int hoursWorked;

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setHourlyRate(double hourlyRate) {
            this.hourlyRate = hourlyRate;
            return this;
        }

        public Builder setHoursWorked(int hoursWorked) {
            this.hoursWorked = hoursWorked;
            return this;
        }

        public HourlyEmployee build() {
            return new HourlyEmployee(firstName, lastName, hourlyRate, hoursWorked);
        }
    }
}
