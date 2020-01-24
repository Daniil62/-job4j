package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;

public class MortgageTest {
    @Test
    public void mortgageCalculator() {
        Mortgage mg = new Mortgage();
        int out = mg.year(100, 70, 50);
        Assert.assertThat(out, is(4));
    }
    @Test
    public void mortgageCalculator2() {
        Mortgage mg = new Mortgage();
        int out = mg.year(3000000, 540000, 11);
        Assert.assertThat(out, is(10));
    }
}
