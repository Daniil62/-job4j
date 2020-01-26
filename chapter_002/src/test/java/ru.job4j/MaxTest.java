package ru.job4j;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.oop.Max;
import static org.hamcrest.core.Is.is;

public class MaxTest {
    @Test
    public void maxFromTwo() {
        Max max = new Max();
        double out = max.max(1, 4);
        Assert.assertThat(out, is(4.0));
    }
    @Test
    public void maxFromThree() {
        Max max = new Max();
        double out = max.max(11, 4, 15);
        Assert.assertThat(out, is(15.0));
    }
    @Test
    public void maxFromFour() {
        Max max = new Max();
        double out = max.max(14.7, 60, 11, 5);
        Assert.assertThat(out, is(60.0));
    }
    @Test
    public void maxFromFive() {
        Max max = new Max();
        double out = max.max(14, 43.4, 66.6, 89, 123.2);
        Assert.assertThat(out, is(123.2));
    }
    @Test
    public void maxFromSix() {
        Max max = new Max();
        double out = max.max(51, 97, 14, 45.1, 3.14, 2.11);
        Assert.assertThat(out, is(97.0));
    }
}
