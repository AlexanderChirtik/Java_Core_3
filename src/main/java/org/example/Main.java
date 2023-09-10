package org.example;

public class Main {
    public static void main(String[] args) {
        Employee.employeesList.add(new Worker("Иван", "Сидоров", 1200));
        Employee.employeesList.add(new Worker("Степан", "Дмитрюк", 2400));
        Employee.employeesList.add(new Freelancer("Егор", "Яшин", 3500, 26));
        Employee.employeesList.add(new Freelancer("Игнат", "Королев", 4000, 5));
        Employee.employeesList.sort(new SurnameComparator());
        Employee.printEmployeesList();
    }
}