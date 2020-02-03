package ru.job4j.strategy;

public class Triangle implements Shape {
    @Override
    public String draw() {
        StringBuilder pic = new StringBuilder();
        pic.append(("   +   " + System.lineSeparator())
                + ("  + +  " + System.lineSeparator())
                + (" +   + " + System.lineSeparator())
                + ("+++++++" + System.lineSeparator()));
        return pic.toString();
    }
}
