package ru.job4j.oop;

public class Mason extends Builder {
    private String instrument = "spatula";
    public Mason(String name, int age, boolean workPermit) {
        super(name, age, workPermit);
    }
    public void building(Cottage cottage, BuildingMaterial bricks) {
    }
}
