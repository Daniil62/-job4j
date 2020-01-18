package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenExist() {
        boolean result = Triangle.exist(5.0, 6.0, 4.0);
        assertThat(result, is(true));
    }
    @Test
    public void noExist() {
        boolean result = Triangle.exist(5.0, 11.0, 4.0);
        assertThat(result, is(false));
    }
}
