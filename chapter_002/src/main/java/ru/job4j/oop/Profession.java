package ru.job4j.oop;

public class Profession {
private String name;
private int age;
private int salary;
private boolean workPermit;
public Profession(String name, int age, boolean workPermit) {
    this.name = name;
    this.age = age;
    this.workPermit = workPermit;
}
public String getName() {
    return name;
}
public int getSalary() {
    return salary;
}
public void setSalary(int salary) {
    this.salary = salary;
}
public void setPremium(int premium) {
    salary += premium;
}
public void setPenalty(int penalty) {
    salary -= penalty;
}
public void setWorkPermit() {
    if(!workPermit) {
        salary = 0;
        setPenalty(10000);
    }
}
}
