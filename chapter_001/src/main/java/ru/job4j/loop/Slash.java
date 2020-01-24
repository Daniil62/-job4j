package ru.job4j.loop;

public class Slash {
    public static void draw(int size, char symbol) {
        int start = (size);
        System.out.println("Draw by " + size + " symbols.");
        for (int i = 1; i <= size; ++i) {
            for (int j = 1; j <= size; ++j) {
                if (j == i || j == start) {
                    System.out.print(symbol);
                } else {
                    System.out.print(" ");
                }
            }
            --start;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Slash.draw(3, '%');
        Slash.draw(5, 'a');
        Slash.draw(11, '@');
        Slash.draw(23, '=');
        Slash.draw(47, 'X');
        Slash.draw(95, '+');
        Slash.draw(177, 'D');
    }
}

