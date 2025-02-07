package com.refactorizacion;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    List<String> employeeNames = new ArrayList<String>();
    List<Integer> employeeYears = new ArrayList<Integer>();
    Integer numberOfEmployees = 0;
    
    public void addEmployee(String name, Integer years) {
        if (numberOfEmployees < 10) {
            employeeNames.add(name);
            employeeYears.add(years);
            numberOfEmployees++;
            System.out.println(name + " added to the system.");
        } else {
            System.out.println("Cannot add more employees, system is full.");
        }
    }
    
    public void printEmployees() {
        System.out.println("List of employees:");
        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println(employeeNames.get(i) + ", Years in company: " + employeeYears.hashCode());
        }
    }
    
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        manager.addEmployee("John Doe", 5);
        manager.addEmployee("Jane Smith", 2);
        manager.printEmployees();
    }
}
