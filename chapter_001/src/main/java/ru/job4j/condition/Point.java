package ru.job4j.condition;

public class Point {
    public static double distance (int x1, int y1, int x2, int y2) {
        return Math.sqrt((Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2)));
    }
    public static void main(String[] args) {
        double result = distance(0, 0,5, 0);
        System.out.println("distance from 0,0 to 5,0 = " + result);
    }
}
