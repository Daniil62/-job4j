package ru.job4j.oop;

public class Max {
    public double max(double first, double second) {
        return first < second ? second : first;
    }
    public double max(double first, double second, double third) {
        return max(first, second) < third ? third : max(first, second);
    }
    public double max(double first, double second, double third, double fourth) {
        return max(first, second, third) < fourth ? fourth : max(first, second, third);
    }
    public double max(double first, double second, double third, double fourth, double fifth) {
        return max(first, second, third, fourth) < fifth ? fifth : max(first, second, third, fourth);
    }
    public double max(double first, double second, double third, double fourth, double fifth, double sixth) {
        return max(first, second, third, fourth, fifth) < sixth ? sixth : max(first, second, third, fourth, fifth);
    }

    public static void main(String[] args) {
        Max maximum = new Max();
        System.out.println(maximum.max(1, 23, 15, 8, 90, 41));
    }
}
