package com.madhu.assignment.utilities;

import com.madhu.assignment.employees.Employee;

public class EmployeeUtilities {
    // Method to increase salary
    public void giveRaise(Employee emp, double amount) {
        double newSalary = emp.getSalary() + amount;
        emp.setSalary(newSalary);
        System.out.println(emp.getName() + " got a raise! New Salary: " + newSalary);
    }

    // Method to display employee details
    public void printEmployee(Employee emp) {
        emp.displayInfo();
    }
}
