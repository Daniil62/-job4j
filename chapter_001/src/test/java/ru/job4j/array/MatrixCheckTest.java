package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;

public class MatrixCheckTest {
    @Test
    public void checkTheLine3x3T() {
        char[][] board = {
                {' ', ' ', ' '},
                {'#', '#', '#'},
                {' ', ' ', ' '}
        };
        boolean out = MatrixCheck.monoHorizontal(board, 1, '#');
        Assert.assertThat(out, is(true));
    }
    @Test
    public void checkTheLine5x4F() {
        char[][] board = {
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {'#', '#', '#', '-', '#'},
                {' ', ' ', ' ', ' ', ' '}
        };
        boolean out = MatrixCheck.monoHorizontal(board, 2, '#');
        Assert.assertThat(out, is(true));
    }
    @Test
    public void checkTheLine3x6T() {
        char[][] board = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {'*', '*', '*'},
                {' ', ' ', ' '}
        };
        boolean out = MatrixCheck.monoHorizontal(board, 4, '*');
        Assert.assertThat(out, is(true));
    }
}
