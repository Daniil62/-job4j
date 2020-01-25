package ru.job4j.oop;

import java.util.Random;

public class BallStory {
    public static class Ball {
        private Random variant = new Random();
        int result;
        String replic = "я от всех убежал и от тебя убегу.";
        public int runaway() {
            if (variant.nextInt(3) != 0) {
                result = 1;
            } else {
                result = 0;
            }
            return result;
        }
        public void failOrWin(Wolf wolf) {
            if(wolf.fin != 0) {
                System.out.println("\n-Ахаха, тупой волк, я опять сбежал!");
            } else {
                System.out.println("\n-На этот раз мне конец.");
            }
        }
        public void failOrWin(Fox fox) {
            if(fox.fin != 0) {
                System.out.println("\n-Ахаха, тупая лиса, я опять сбежал!");
            } else {
                System.out.println("\n-На этот раз я пропал.");
            }
        }
        public void failOrWin(Haer haer) {
            if(haer.fin != 0) {
                System.out.println("\n-Ахаха, тупой заяц, я опять сбежал!");
            } else {
                System.out.println("\n-О, судьба, как ты глумишься надо мной, меня съел заяц.");
            }
        }
    }
    public static class Wolf {
        int fin;
        int destiny = 0;
        public int tryToEat(Ball ball) {
            System.out.println("\nКолобок, я тебя съем, тут без вариантов.");
            System.out.println("\n -Волк, " + ball.replic);
            if (destiny == ball.runaway()) {
                System.out.println("\nАхахаха, Колобок, я сожрал тебя, мой желудок полон сладкого теста.");
                fin = 0;
            } else {
                System.out.println("\nО нет, опять Колобок удрал, пойду сожру зайца.");
                fin = 1;
            }
            return fin;
        }
    }
    public static class Fox {
        int fin;
        int destiny = 0;
        public int tryToEat(Ball ball) {
            System.out.println("\nКолобок, я так голодна, тебе конец.");
            System.out.println("\n -Лиса, " + ball.replic);
            if (destiny == ball.runaway()) {
                System.out.println("\nАхахаха, какое вкусное хлебобулочное изделие.");
                this.fin = 0;
            } else {
                System.out.println("\nПроклятье, опять Колобок удрал, пойду поищу зайца!");
                this.fin = 1;
            }
            return fin;
        }
    }
    public static class Haer {
        int fin;
        int destiny = 0;
        public int tryToEat(Ball ball) {
            System.out.println("\nКолобок, как бы смешно это ни звучало, но я тебя съем.");
            System.out.println("\n -Заяц, " + ball.replic);
            if (destiny == ball.runaway()) {
                System.out.println("\nАхахаха, невероятно, мне это удалось.");
                this.fin = 0;
            } else {
                System.out.println("\nНепонятно на что я надеялся, он убежал.");
                this.fin = 1;
            }
            return fin;
        }
    }
    public static void main(String[] args) {
        BallStory story = new BallStory();
        Ball ball = new Ball();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        Haer haer = new Haer();
        wolf.tryToEat(ball);
        ball.failOrWin(wolf);
        fox.tryToEat(ball);
        ball.failOrWin(fox);
        haer.tryToEat(ball);
        ball.failOrWin(haer);
    }
}
