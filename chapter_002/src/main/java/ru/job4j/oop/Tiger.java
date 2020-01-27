package ru.job4j.oop;

public class Tiger extends Predator {
    public Tiger() {
        System.out.println("Вызов конструктора класса Tiger.");
    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
    }
}
