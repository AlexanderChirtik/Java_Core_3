package org.example;

public class Worker extends Employee{
    public Worker(String name, String surname, double rate) {
        super(name, surname, rate);
    }

    /**
     * Метод расчитывает заработную плату с учетом того, что у рабочих фиксированный график (40 часов в неделю)
     * @return
     */
    @Override
    public double calculateSalary() {
        hours = 40;
        salary = rate * hours;
        return salary;
    }

    @Override
    public String toString() {
        return String.format("Рабочий: %s %s; Среднемесячная заработная плата (фиксированная месячная оплата): " +
                "%.2f (рублей)", name, surname, calculateSalary());
    }
}
