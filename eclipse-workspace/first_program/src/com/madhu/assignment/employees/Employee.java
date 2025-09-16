package com.madhu.assignment.employees;

public class Employee {

	private String name;
    private int employeeId;
    private double salary;
    
    // Protected attribute (accessible in subclasses)
    protected String role;
    
    // Constructor
    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
        this.role = "Employee"; // default role
    }

    // Getters & Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getEmployeeId() { return employeeId; }
    public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }
    
    // Protected method (subclasses can override/extend this)
    protected void showRole() {
        System.out.println("Role: " + role);
    }
    
    // Method to display employee details
    public void displayInfo() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", Salary: " + salary);
        showRole(); // will also print role
    }

}
