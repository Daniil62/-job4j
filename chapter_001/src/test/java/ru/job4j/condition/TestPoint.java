package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class TestPoint {
    @Test
    public void distance() {
        double expected = 5.0;
        double out = Point.distance(0, 0, 5, 0);
        Assert.assertEquals(expected, out, 0.0);
    }
}
