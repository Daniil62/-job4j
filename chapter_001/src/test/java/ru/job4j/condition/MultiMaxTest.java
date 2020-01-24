package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;

public class MultiMaxTest {
    @Test
    public void findMaxValue() {
        MultiMax check = new MultiMax();
        int result = check.max(90, 35, 80);
        Assert.assertThat(result, is(90));
    }
}
