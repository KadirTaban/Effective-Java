package org.example.Item01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Employee {
    private String name;
    private String companyName;

    private Employee(String name, String companyName){
        this.name = name;
        this.companyName = companyName;
    }

    public static Employee createEmployee(String name, String companyName){
        return new Employee(name,companyName);
    }

    public static Employee createEmployee(String name){
        return new Employee(name,"egaranti");
    }

    public static List<Employee> createEmployeeList(Employee... employees) {
        return Arrays.asList(employees);
    }

    @Override
    public String toString() {
        return "Employee: name = " + name + ", age = " + companyName;
    }
}
