package ru.job4j.strategy;

public class Square implements Shape {
    @Override
    public String draw() {
        StringBuilder pic = new StringBuilder();
        pic.append(("++++++" + System.lineSeparator())
                + ("+    +" + System.lineSeparator())
                + ("+    +" + System.lineSeparator())
                + ("++++++" + System.lineSeparator()));
        return pic.toString();
    }
}
