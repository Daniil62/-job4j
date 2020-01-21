package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;

public class MinDiapasonTest {
    @Test
    public void findMinInInTest() {
        int[] array = new int[]{67, 90, 4, 15, 6, 94, 179, 13, 0, 11, 7};
        int out = MinDiapason.findMinIn(array, 2, 7);
        Assert.assertThat(out, is(4));
    }
    @Test
    public void findMinInInTest2() {
        int[] array = new int[]{67, 90, 4, 15, 6, 94, 179, 13, 0, 11, 7};
        int out = MinDiapason.findMinIn(array, 6, 10);
        Assert.assertThat(out, is(0));
    }
}
