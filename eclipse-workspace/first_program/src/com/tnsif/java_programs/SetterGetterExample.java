package com.tnsif.java_programs;

class Student {
    
    private String name;
    private int age;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setAge(int a) {
        if(a > 0) {    
            age = a;
        } else {
            System.out.println("Invalid age!");
        }
    }

    public int getAge() {
        return age;
    }
}

public class SetterGetterExample {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setName("Madhumitha");
        s1.setAge(21);
        
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
    }
}
