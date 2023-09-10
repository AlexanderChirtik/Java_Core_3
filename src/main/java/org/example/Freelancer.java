package org.example;

public class Freelancer extends Employee{

    /**
     * В конструкторе для фрилансеров будут подаваться и ставка,
     * и количество отработанных часов для дальнейшего расчета
     * @param name
     * @param surname
     * @param rate
     * @param hours
     */
    public Freelancer(String name, String surname, double rate, int hours) {
        super(name, surname, rate, hours);
    }

    @Override
    public double calculateSalary() {
        salary = rate * hours;
        return salary;
    }

    @Override
    public String toString() {
        return String.format("Рабочий %s %s; Среднемесячная заработная плата (почасовая ставка): " +
                "%.2f (рублей)", name, surname, calculateSalary());
    }
}
