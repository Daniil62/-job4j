package ru.job4j.oop;

public class Dog {
    String name;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        dog.setName("Polkan");
        dog2.setName("Sharik");
        dog3.setName("Zhuchka");
        System.out.println(dog.getName());
        System.out.println(dog2.getName());
        System.out.println(dog3.getName());
    }
}
