package ru.job4j.loop;

public class Board {
    public static void paintBoard(int vertical, int horizon) {
        for (int i = 0; i < vertical; ++i) {
            for (int j = 0; j < horizon; ++j) {
                if ((i + j) % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Board.paintBoard(3, 3);
        System.out.println();
        Board.paintBoard(4, 4);
    }
}
