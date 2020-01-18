package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;

public class FactorialTest {
    @Test
    public void factorialiserTest() {
        Factorial fact = new Factorial();
        int out = fact.factorialiser(7);
        Assert.assertThat(out, is(5040));
    }
    @Test
    public void factorialiserTest2() {
        Factorial fact = new Factorial();
        int out = fact.factorialiser(5);
        Assert.assertThat(out, is(120));
    }
    @Test
    public void factorialiserTest3() {
        Factorial fact = new Factorial();
        int out = fact.factorialiser(0);
        Assert.assertThat(out, is(1));
    }
    @Test
    public void factorialiserTest4() {
        Factorial fact = new Factorial();
        int out = fact.factorialiser(1);
        Assert.assertThat(out, is(1));
    }
}
