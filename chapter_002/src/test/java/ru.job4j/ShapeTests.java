package ru.job4j;

import org.junit.Test;
import org.junit.Assert;
import ru.job4j.strategy.Shape;
import ru.job4j.strategy.Square;
import ru.job4j.strategy.Triangle;
import static org.hamcrest.core.Is.is;

public class ShapeTests {
    @Test
    public void squareDrawTest() {
        Shape square = new Square();
        StringBuilder pic = new StringBuilder();
        Assert.assertThat(square.draw(), is(
                pic.append("++++++" + System.lineSeparator())
                + ("+    +" + System.lineSeparator())
                + ("+    +" + System.lineSeparator())
                + ("++++++" + System.lineSeparator())));
    }
    @Test
    public void triangleDrawTest() {
        Shape triangle = new Triangle();
        StringBuilder pic = new StringBuilder();
        Assert.assertThat(triangle.draw(), is(
                pic.append("   +   " + System.lineSeparator())
                + ("  + +  " + System.lineSeparator())
                + (" +   + " + System.lineSeparator())
                + ("+++++++" + System.lineSeparator())));
    }
}
