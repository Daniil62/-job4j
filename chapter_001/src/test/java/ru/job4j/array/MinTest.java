package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;

public class MinTest {
    @Test
    public void findMinTest() {
        int[] array = new int[]{12, 3, 89, 0, 1, 54, 5, 666, 11, 274};
        int out = Min.findMin(array);
        Assert.assertThat(out, is(0));
    }
    @Test
    public void findMinTest2() {
        int[] array = new int[]{12, 3, 89, 54, 5, 666, 11, 274, 1};
        int out = Min.findMin(array);
        Assert.assertThat(out, is(1));
    }
}
