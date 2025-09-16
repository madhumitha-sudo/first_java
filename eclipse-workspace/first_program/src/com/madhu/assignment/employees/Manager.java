package com.madhu.assignment.employees;

public class Manager extends Employee {
    private String department;

    public Manager(String name, int employeeId, double salary, String department) {
        super(name, employeeId, salary);
        this.department = department;
        this.role = "Manager"; // accessing protected field
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}
