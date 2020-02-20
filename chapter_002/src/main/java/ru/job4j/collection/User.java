package ru.job4j.collection;

import java.util.Objects;

public class User implements Comparable<User> {
    private String name;
    private String surname;
    private int age;
    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public String getName() {
        return this.name;
    }
    public String getSurname() {
        return this.surname;
    }
    public int getAge() {
        return this.age;
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }
    @Override
    public String toString() {
        return ("name: " + this.name + ", surname: " + this.surname + ", age: " + this.age
                + System.lineSeparator());
    }
    @Override
    public int compareTo(User o) {
        int result = this.name.compareTo(o.name);
        if (result == 0) {
            result = this.name.compareTo(o.name);
            if (result == 0) {
                result = this.surname.compareTo(o.surname);
                if (result == 0) {
                    result = Integer.compare(this.age, o.age);
                }
            }
        }
        return result;
    }
}
