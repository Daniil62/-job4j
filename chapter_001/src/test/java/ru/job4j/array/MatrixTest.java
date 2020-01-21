package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class MatrixTest {
    @Test
    public void matrixTest() {
        Matrix matrix = new Matrix();
        int[][] array = matrix.multiple(4);
        int[][] expected = {
                {1, 2, 3, 4},
                {2, 4, 6, 8},
                {3, 6, 9,12},
                {4, 8,12,16}
        };
        Assert.assertThat(array, is(expected));
    }
}
