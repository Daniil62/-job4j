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

    public static boolean monoVertical(char[][] board, int col, char symbol) {
        boolean result = true;
        for(int i = 0; i < board.length - 1; ++i) {
            if(board[i][col] != symbol) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] result = new char[board.length];
        for(int i = 0; i < board.length; ++i) {
            result[i] = board[i][i];
        }
        return result;
    }

    public static boolean isWin(char[][]board) {
        boolean result = false;
        for(int i = 0; i < board.length; ++i) {
            if(board[i][i] == 'X') {
                if(MatrixCheck.monoHorizontal(board, i, 'X')) {
                    result = true;
                    break;
                } else if(board[i][i] == 'X') {
                    if(MatrixCheck.monoVertical(board, i, 'X')) {
                        result = true;
                        break;
                    }
                }
            }
        }
        return result;
    }
}

