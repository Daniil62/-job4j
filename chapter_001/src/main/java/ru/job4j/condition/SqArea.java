package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        return k * Math.pow(p / (2 * (k + 1)), 2);
    }
    public static void main(String[] args) {
        double s = (square(30, 1.5));
        System.out.println("p = 30, k = 1.5, s = " + s);
    }
}
