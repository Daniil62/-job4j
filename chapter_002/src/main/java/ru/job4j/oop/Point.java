package ru.job4j.oop;

public class Point {
    private int x, y, z;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double distance(Point another) {
        return Math.sqrt((Math.pow((this.x - another.x), 2) + Math.pow((this.y - another.y), 2)));
    }
    public double distance3D(Point another) {
        return Math.sqrt((Math.pow((this.x - another.x), 2) + Math.pow((this.y - another.y), 2)
                + Math.pow((this.z - another.z), 2)));
    }
    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(9, 0);
        Point c = new Point(10, 10, 10);
        Point d = new Point(20, 20, 15);
        double dist = (a.distance(b));
        double dist3D = (c.distance3D(d));
        System.out.println("distance from " + a.x + "," + a.y + " to " + b.x + "," + b.y + " = " + dist);
        System.out.println("distance from " + c.x + "," + c.y + "," + c.x + " to " + d.x + "," + d.y + ","
                + d.z + " = " + dist3D);
    }
}

