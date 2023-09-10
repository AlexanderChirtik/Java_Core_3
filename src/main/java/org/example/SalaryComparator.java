package org.example;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee employee1, Employee employee2) {
        return Double.compare(employee1.getSalary(), employee2.getSalary());
    }
}
