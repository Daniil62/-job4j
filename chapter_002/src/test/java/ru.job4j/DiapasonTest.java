package ru.job4j;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.lambda.Diapason;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;

public class DiapasonTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        Diapason d = new Diapason();
        List<Double> result = d.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        Assert.assertThat(result, is(expected));
    }
    @Test
    public void whenLinearFunctionThenQuartoResults() {
        Diapason d = new Diapason();
        List<Double> result = d.diapason(5, 8, x -> x * x);
        List<Double> expected = Arrays.asList(25D, 36D, 49D);
        Assert.assertThat(result, is(expected));
    }
    @Test
    public void whenLinearFunctionThenLogResults() {
        Diapason d = new Diapason();
        List<Double> result = d.diapason(2, 3, x -> Math.log(x * 100));
        List<Double> expected = Arrays.asList(Math.log(200));
        Assert.assertThat(result, is(expected));
    }
}
