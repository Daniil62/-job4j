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

//-----------------------------------------------------------------------------------------------------------

    @Test
    public void checkVerticalLine3x6T() {
        char[][] board = {
                {' ', '^', ' '},
                {' ', '^', ' '},
                {' ', '^', ' '},
                {' ', '^', ' '},
                {' ', '^', ' '},
                {' ', '^', ' '}
        };
        boolean out = MatrixCheck.monoVertical(board, 1, '^');
        Assert.assertThat(out, is(true));
    }
    @Test
    public void checkVerticalLine5x5T() {
        char[][] board = {
                {' ', ' ', ' ', '@', ' '},
                {' ', ' ', ' ', '@', ' '},
                {' ', ' ', ' ', '@', ' '},
                {' ', ' ', ' ', '@', ' '},
                {' ', ' ', ' ', '@', ' '}
        };
        boolean out = MatrixCheck.monoVertical(board, 3, '@');
        Assert.assertThat(out, is(true));
    }
    @Test
    public void checkVerticalLine4x6F() {
        char[][] board = {
                {' ', ' ', ' ', '?'},
                {' ', ' ', ' ', '?'},
                {' ', ' ', ' ', 'W'},
                {' ', ' ', ' ', '?'},
                {' ', ' ', ' ', '?'},
                {' ', ' ', ' ', '?'}
        };
        boolean out = MatrixCheck.monoVertical(board, 3, '?');
        Assert.assertThat(out, is(false));
    }

//-------------------------------------------------------------------------------------------------------

    @Test
    public void whenDiagonal() {
        char[][] input = {
                {'#', ' ', ' ', ' '},
                {' ', '#', ' ', ' '},
                {' ', ' ', '#', ' '},
                {' ', ' ', ' ', '#'}
        };
        char[] result = MatrixCheck.extractDiagonal(input);
        char[] expect = {'#', '#', '#', '#'};
        Assert.assertThat(result, is(expect));
    }

//-------------------------------------------------------------------------------------------------------

    @Test
    public void whenDataMonoByTrueThenTrue() {
        char[][] input = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck.isWin(input);
        Assert.assertThat(result, is(true));
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        char[][] input = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', 'X', ' ', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck.isWin(input);
        Assert.assertThat(result, is(false));
    }

    @Test
    public void whenDataHMonoByTrueThenTrue() {
        char[][] input = {
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {'X', 'X', 'X', 'X', 'X'},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck.isWin(input);
        Assert.assertThat(result, is(true));
    }

    @Test
    public void whenDataHMonoByTrueThenTrue2() {
        char[][] input = {
                {' ', ' ', ' ', ' ', 'X'},
                {' ', ' ', ' ', ' ', 'X'},
                {'X', '8', 'X', 'X', 'X'},
                {' ', ' ', 'X', ' ', 'X'},
                {' ', ' ', 'X', ' ', 'X'},
        };
        boolean result = MatrixCheck.isWin(input);
        Assert.assertThat(result, is(true));
    }
}
