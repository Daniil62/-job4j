package ru.job4j.calculator;

public class Fit {
    public static double manWeight(double height) {
        return (height - 100) * 1.15;
    }
    public static double womanWeight(double height) {
        return (height - 110) * 1.15;
    }
    public static void main(String[] args) {
        double man = manWeight(180);
        double woman = womanWeight(180);
        System.out.println("Ideal weight for a man of 180 cm is:" + man);
        System.out.println("Ideal weight for a woman of 180 cm is:" + woman);
    }
}
