package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.Matchers.is;

public class CheckPrimeNumberTest {
    @Test
    public void primeTest() {
        boolean out = CheckPrimeNumber.check(7);
        Assert.assertThat(out, is(true));
    }
    @Test
    public void primeTest2() {
        boolean out = CheckPrimeNumber.check(8);
        Assert.assertThat(out, is(false));
    }
    @Test
    public void primeTest3() {
        boolean out = CheckPrimeNumber.check(2);
        Assert.assertThat(out, is(true));
    }
    @Test
    public void primeTest4() {
        boolean out = CheckPrimeNumber.check(4);
        Assert.assertThat(out, is(false));
    }
}
