package ru.job4j.oop;

public class Predator extends Animal {
    public Predator() {
        System.out.println("Вызван конструктор по умолчанию класса Predator.");
    }
    public Predator(String name) {
        super(name);
        System.out.println("Вызван конструктор с параметром класса Predator.");
    }
}
