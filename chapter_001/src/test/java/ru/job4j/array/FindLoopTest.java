package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;

public class FindLoopTest {
    @Test
    public void elementIndex () {
        FindLoop find = new FindLoop();
        int[] array = new int[] {12, 56, 34, 86, 53};
        int out = find.indexOf(array, 34);
        Assert.assertThat(out, is(2));
    }
    @Test
    public void elementIndex2 () {
        FindLoop find = new FindLoop();
        int[] array = new int[] {14, 10, 85};
        int out = find.indexOf(array, 14);
        Assert.assertThat(out, is(0));
    }
    @Test
    public void elementIndex3 () {
        FindLoop find = new FindLoop();
        int[] array = new int[] {14, 10, 85};
        int out = find.indexOf(array, 15);
        Assert.assertThat(out, is(-1));
    }
}
