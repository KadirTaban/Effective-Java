package org.example.Item01;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee employee = Employee.createEmployee("Kadir", "Egaranti");
        Employee employee1 = Employee.createEmployee("Oğuzhan");

        List<Employee> employees = Employee.createEmployeeList(employee1,employee);

        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i).toString());
        }
    }
}
