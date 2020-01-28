package ru.job4j.oop;

public class Surgeon extends Doctor {
    private String instrument = "scalpel";
    public Surgeon(String name, int age, boolean workPermit) {
        super(name, age, workPermit);
    }
    public void operation(Patient patient, Pathology appendicitis) {
    }
}
