package ru.job4j.oop;

public class Point {
    private int x, y;
    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }
    public double distance(Point another) {
        return Math.sqrt((Math.pow((this.x - another.x), 2) + Math.pow((this.y - another.y), 2)));
    }
    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(9, 0);
        double dist = (a.distance(b));
        System.out.println("distance from " + a.x + "," + a.y +" to " + b.x + "," + b.y + " = " + dist);
    }
}

