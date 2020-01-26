package ru.job4j.oop;

public class Triangle {
    private Point a;
    private Point b;
    private Point c;
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public boolean exist() {
        double ab = a.distance(b);
        double bc = b.distance(c);
        double ca = c.distance(a);
        boolean result = false;
        if (ab + bc > ca && bc + ca > ab && ab + ca > bc) {
            result = true;
        }
            return result;
    }
    public double perimeter() {
        double ab = a.distance(b);
        double bc = b.distance(c);
        double ca = c.distance(a);
        double result = -1.0;
        if (exist()) {
            result = ab + bc + ca;
        }
        return result;
    }
    public double area() {
        double p = perimeter();
        double ab = a.distance(b);
        double bc = b.distance(c);
        double ca = c.distance(a);
        double result = -1.0;
        if (exist()) {
            result =  Math.sqrt((p / 2) * ((p / 2) - ab) * ((p / 2) - bc) * ((p / 2) - ca));
        }
        return result;
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(9, 0);
        Point c = new Point(7, 7);
        Triangle triangle = new Triangle(a, b, c);
        System.out.println(triangle.exist());
        System.out.println(triangle.perimeter());
        System.out.println(triangle.area());
        Point first = new Point(120, 7);
        Point second = new Point(29, 7);
        Point third = new Point(70, 7);
        Triangle fake = new Triangle(first, second, third);
        System.out.println(fake.exist());
        System.out.println(fake.perimeter());
        System.out.println(fake.area());
    }
}
