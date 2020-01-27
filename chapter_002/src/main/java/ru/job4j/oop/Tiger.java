package ru.job4j.oop;

public class Tiger extends Predator {
    public Tiger() {
        System.out.println("Вызван конструктор по умолчанию класса Tiger.");
    }
    public Tiger(String name) {
        super(name);
        System.out.println("Вызван конструктор с параметром класса Tiger.");
    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Tiger secondTiger = new Tiger("tiger");
        Animal animal = new Animal();
    }
}
