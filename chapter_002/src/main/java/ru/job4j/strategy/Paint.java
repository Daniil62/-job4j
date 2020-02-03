package ru.job4j.strategy;

public class Paint {
    public void draw(Shape shape) {
        System.out.println(shape.draw());
    }

    public static void main(String[] args) {
        Paint paint = new Paint();
        Shape squareShapedBox = new Square();
        Shape triangleShapedBox = new Triangle();
        paint.draw(squareShapedBox);
        paint.draw(triangleShapedBox);
    }
}
