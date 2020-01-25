package ru.job4j.oop;

public class DummyDict {
    public String engToRus(String eng) {
        return eng + " - неизвестное слово.";
    }

    public static void main(String[] args) {
        DummyDict dict = new DummyDict();
        System.out.println(dict.engToRus("Translation"));
    }
}
