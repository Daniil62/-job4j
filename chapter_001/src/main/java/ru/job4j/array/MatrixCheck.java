package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row, char symbol) {
        boolean result = true;
        for(int i = 0; i < board[0].length - 1; ++i) {
            if(board[row][i] != symbol) {
                result = false;
                break;
            }
        }
        return result;
    }
}

