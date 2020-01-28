package ru.job4j.oop;

public class Engineer extends Builder {
    private String instrument = "computer";
    public Engineer(String name, int age, boolean workPermit) {
        super(name, age, workPermit);
    }
    public void drawing(Cottage cottage, Computation loads) {
    }
}
