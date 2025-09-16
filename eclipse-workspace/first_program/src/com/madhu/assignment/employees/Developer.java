package com.madhu.assignment.employees;

public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, int employeeId, double salary, String programmingLanguage) {
        super(name, employeeId, salary);
        this.programmingLanguage = programmingLanguage;
        this.role = "Developer"; // accessing protected field
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}
