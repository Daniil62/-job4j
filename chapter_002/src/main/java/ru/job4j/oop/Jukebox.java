package ru.job4j.oop;

public class Jukebox {
    private
    String nirvanaDumb = "I'm not like them\n"
                       + " But I can pretend...\n";
    String nirvanaLithium = "I'm so happy.\n"
                          + "Cause today I found my friends...\n";
    String jdDecades = "Here are the young men, the weight on their shoulders\n"
                     + "Here are the young men, well where have they been?..\n";
    public
    void music(int position) {
        switch (position) {
            case 1: {
                System.out.println(nirvanaDumb);
                break;
            }
            case 2: {
                System.out.println(nirvanaLithium);
                break;
            }
            case 3: {
                System.out.println(jdDecades);
                break;
            }
            default: {
                System.out.println("Такой композиции нет в трек-листе.");
            }
        }
    }

    public static void main(String[] args) {
        Jukebox play = new Jukebox();
        play.music(3);
        play.music(7);
    }
}
