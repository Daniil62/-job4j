package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {
    @Test
    public void square() {
        double expected = 54;
        double out = SqArea.square(30, 1.5);
        Assert.assertEquals(expected, out, 0.0);
    }
}
