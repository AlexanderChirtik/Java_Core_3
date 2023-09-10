package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Employee {

    //region Поля с данными работника
    private int id;
    protected String name;
    protected String surname;

    protected double rate; // Ставка за 1 час работы
    protected double salary;
    protected int hours; // Количество отработанных часов
    private static int countEmployees;

    public static List<Employee> employeesList = new ArrayList<>(); // Список работников

    //endregion

    //region Блоки инициализации и конструкторы

    {
        id = countEmployees++;
    }

    public Employee(String name, String surname, double rate){
        if (rate < 1000 || rate > 5000)
            throw new RuntimeException("Часовая ставка должна быть от 1000 до 5000");
        this.name = name;
        this.surname = surname;
        this.rate = rate;
    }

    public Employee(String name, String surname, double rate, int hours) {
        this(name, surname, rate);
        this.hours = hours;
    }

    //endregion

    //region Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    //endregion

    //region Методы

    /**
     * Метод для расчета заработной платы сотрудника
     * @return
     */
    public abstract double calculateSalary();

    /**
     * Метод вывода на экран всех работников из списка employeesList
     */
    public static void printEmployeesList(){
        for (Employee item: employeesList) {
            System.out.println(item);
        }
    }


    /**
     * Метод для вывода данных на экран
     * @return
     */
    @Override
    public String toString() {
        return "Employee{ " +
                "id =" + id +
                ", name ='" + name + '\'' +
                ", surname ='" + surname + '\'' +
                ", salary =" + salary +
                '}';
    }

    /**
     * Метод сортировки сотрудников по заработной плате и фамилии
     * @return
     */

    public int compareTo(Employee employee) {
        if (employee == null) {
            throw new NullPointerException("Нельзя сравнивать с нулем");
        }
        int surnameComparison = this.surname.compareTo(employee.surname);
        if (surnameComparison != 0) {
            return surnameComparison;
        }
        return Double.compare(this.calculateSalary(), employee.calculateSalary());
    }

    //endregion
}
