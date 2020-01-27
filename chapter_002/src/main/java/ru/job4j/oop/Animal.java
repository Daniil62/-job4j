package ru.job4j.oop;

public class Animal {
    private String name;
    public Animal() {
        System.out.println("Вызван конструктор по умолчанию класса Animal.");
    }
    public Animal(String name) {
        this.name = name;
        System.out.println("Вызван конструктор c параметром класса Animal.");
    }
}
