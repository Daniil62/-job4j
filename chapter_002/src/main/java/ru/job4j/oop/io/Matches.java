package ru.job4j.oop.io;

import java.util.Scanner;

public class Matches {
    private int matches;
    private String player;
    public void game() {
        boolean turn = true;
        int again = 1;
        Scanner input = new Scanner(System.in);
        while (again == 1) {
            matches = 11;
            System.out.println("Игра началась.");
            while (matches > 0) {
                if (turn) {
                    player = "игрок А.";
                    System.out.println("Ходит " + player);
                    turn = false;
                } else {
                    player = "игрок Б.";
                    System.out.println("Ходит " + player);
                    turn = true;
                }
                int select = Integer.valueOf(input.nextLine());
                if (select < 1) {
                    select = 1;
                    System.out.println("Вам придется взять хоть одну спичку!");
                }
                if (select > 3) {
                    select = 3;
                    System.out.println("Вы можете взять максимум три спички!");
                }
                matches -= select;
                String correctWord;
                if (matches == 1) {
                    correctWord = " спичка.";
                } else {
                    correctWord = " спичек.";
                }
                System.out.println("на столе остается " + matches + correctWord);
            }
            System.out.println("Победил " + player + System.lineSeparator());
            System.out.println("Новая игра - введите 1" + System.lineSeparator()
                    + "Чтобы выйти введите любую другую команду" + System.lineSeparator());
            again = Integer.valueOf(input.nextLine());
            turn = true;
        }
    }

    public static void main(String[] args) {
        Matches play = new Matches();
        play.game();
    }
}
