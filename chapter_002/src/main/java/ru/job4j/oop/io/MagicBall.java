package ru.job4j.oop.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public void oracle() {
        Scanner input = new Scanner(System.in);
        System.out.println("Задайте свой вопрос." + System.lineSeparator());
        String question = input.nextLine();
        int answer = new Random().nextInt(3);
        if (answer == 0) {
            System.out.println("Да.");
        } else if (answer == 1) {
            System.out.println("Нет.");
        } else {
            System.out.println("Может быть.");
        }
    }

    public static void main(String[] args) {
        MagicBall magicBall = new MagicBall();
        magicBall.oracle();
    }
}
