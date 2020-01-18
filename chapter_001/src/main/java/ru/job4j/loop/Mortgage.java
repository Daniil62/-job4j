package ru.job4j.loop;

public class Mortgage {
    public int year(double amount, int salary, double percent) {
        int year = 0;
        while((amount + (amount / 100) * percent) > 0.0) {
            amount += ((amount / 100) * percent);
            amount -= salary;
            ++ year;
        }
        return year;
    }
}
