package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;

public class SquareTest {
    @Test
    public void squareArrayTest() {
        Square square = new Square();
        int[] out = square.calculate(3);
        int[] expected = new int[]{1, 4, 9};
        Assert.assertThat(out, is(expected));
    }
    @Test
    public void squareArrayTest2() {
        Square square = new Square();
        int[] out = square.calculate(5);
        int[] expected = new int[]{1, 4, 9, 16, 25};
        Assert.assertThat(out, is(expected));
    }
    @Test
    public void squareArrayTest3() {
        Square square = new Square();
        int[] out = square.calculate(8);
        int[] expected = new int[]{1, 4, 9, 16, 25, 36, 49, 64};
        Assert.assertThat(out, is(expected));
    }
    @Test
    public void squareArrayTest4() {
        Square square = new Square();
        int[] out = square.calculate(0);
        int[] expected = new int[]{};
        Assert.assertThat(out, is(expected));
    }
    @Test
    public void squareArrayTest5() {
        Square square = new Square();
        int[] out = square.calculate(1);
        int[] expected = new int[]{1};
        Assert.assertThat(out, is(expected));
    }
}
