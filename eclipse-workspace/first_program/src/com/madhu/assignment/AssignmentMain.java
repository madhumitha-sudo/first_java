package com.madhu.assignment;

import com.madhu.assignment.employees.*;
import com.madhu.assignment.utilities.EmployeeUtilities;

public class AssignmentMain {
    public static void main(String[] args) {
        // Create Employees
        Manager m1 = new Manager("Alice", 101, 90000, "HR");
        Developer d1 = new Developer("Bob", 102, 70000, "Java");

        // Utilities
        EmployeeUtilities utils = new EmployeeUtilities();

        // Print details
        utils.printEmployee(m1);
        utils.printEmployee(d1);

        // Give raises
        utils.giveRaise(m1, 5000);
        utils.giveRaise(d1, 3000);
    }
}
