package org.example;

import java.util.Comparator;

public class SurnameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee employee1, Employee employee2) {
        return employee1.getSurname().compareTo(employee2.getSurname());
    }
}
