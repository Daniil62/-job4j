package ru.job4j;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.oop.Point;
import static org.hamcrest.core.Is.is;

public class PointTest {
    @Test
    public void zeroDistance3D() {
        Point second = new Point(10, 10, 10);
        Point first = new Point(10, 10, 10);
        double out = (second.distance3D(first));
        Assert.assertThat(out, is(0.0));
    }
    @Test
    public void distance3D() {
        Point second = new Point(10, 10, 10);
        Point first = new Point(20, 20, 15);
        double out = (second.distance3D(first));
        Assert.assertThat(out, is(15.0));
    }
}
