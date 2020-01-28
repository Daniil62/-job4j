package ru.job4j.oop;

public class Nurse extends Doctor {
    private String instrument = "syringe";
    public Nurse(String name, int age, boolean workPermit) {
        super(name, age, workPermit);
    }
    public void injection(Patient shizo, Medication aminazine) {
    }
}
