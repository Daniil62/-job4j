package ru.job4j;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.oop.Point;
import ru.job4j.oop.Triangle;

import static org.hamcrest.core.Is.is;

public class TriangleTest {
    @Test
    public void pointExistTrue() {
        Point first = new Point(0, 0);
        Point second = new Point(10, 0);
        Point third = new Point(5, 5);
        Triangle out = new Triangle(first, second, third);
        Assert.assertThat(out.exist(), is(true));
    }
    @Test
    public void pointExistFalse() {
        Point first = new Point(5, 20);
        Point second = new Point(5, 10);
        Point third = new Point(5, 8);
        Triangle out = new Triangle(first, second, third);
        Assert.assertThat(out.exist(), is(false));
    }
    @Test
    public void perimeterTrue() {
        Point first = new Point(0, 0);
        Point second = new Point(10, 0);
        Point third = new Point(5, 5);
        Triangle out = new Triangle(first, second, third);
        Assert.assertThat(out.perimeter(), is(24.14213562373095));
    }
    @Test
    public void perimeterFalse() {
        Point first = new Point(12, 0);
        Point second = new Point(5, 0);
        Point third = new Point(5, 0);
        Triangle out = new Triangle(first, second, third);
        Assert.assertThat(out.perimeter(), is(-1.0));
    }
    @Test
    public void areaTrue() {
        Point first = new Point(10, 10);
        Point second = new Point(20, 10);
        Point third = new Point(15, 15);
        Triangle out = new Triangle(first, second, third);
        Assert.assertThat(out.area(), is(25.000000000000004));
    }
    @Test
    public void areaFalse() {
        Point first = new Point(12, 0);
        Point second = new Point(5, 0);
        Point third = new Point(5, 0);
        Triangle out = new Triangle(first, second, third);
        Assert.assertThat(out.area(), is(-1.0));
    }
}
