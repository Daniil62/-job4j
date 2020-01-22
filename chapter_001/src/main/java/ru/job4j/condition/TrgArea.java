package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        return Math.sqrt(((a+b+c)/2)*(((a+b+c)/2)-a)*(((a+b+c)/2)-b)*(((a+b+c)/2)-c));
    }
    public static void main(String[] args) {
        double rsl = TrgArea.area(12, 14, 14);
        System.out.println("Area of triangle 12, 14, 14 = " + rsl);
    }
}
