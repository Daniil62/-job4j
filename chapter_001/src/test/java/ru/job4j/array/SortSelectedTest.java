package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;

public class SortSelectedTest {
    @Test
    public void arraySelectTest() {
        int[] data = new int[]{12, 4, 9, 1, 10, 6, 7, 5, 3, 8, 2, 11};
        int[] out = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        Assert.assertThat(out, is(expected));
    }
    @Test
    public void arraySelectTest2() {
        int[] data = new int[]{1, 2, 4, 3, 5};
        int[] out = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        Assert.assertThat(out, is(expected));
    }
}
