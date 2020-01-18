package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;

public class PrimeNumbCalculateTest {
    @Test
    public void primeCalcTest() {
        PrimeNumbCalculate pnc = new PrimeNumbCalculate();
        int out = pnc.primeCalc(5);
        Assert.assertThat(out, is(4));
    }
    @Test
    public void primeCalcTest2() {
        PrimeNumbCalculate pnc = new PrimeNumbCalculate();
        int out = pnc.primeCalc(11);
        Assert.assertThat(out, is(6));
    }
    @Test
    public void primeCalcTest3() {
        PrimeNumbCalculate pnc = new PrimeNumbCalculate();
        int out = pnc.primeCalc(0);
        Assert.assertThat(out, is(0));
    }
    @Test
    public void primeCalcTest4() {
        PrimeNumbCalculate pnc = new PrimeNumbCalculate();
        int out = pnc.primeCalc(20);
        Assert.assertThat(out, is(9));
    }
}
