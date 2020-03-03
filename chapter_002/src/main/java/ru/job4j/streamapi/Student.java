package ru.job4j.streamapi;

import java.util.Objects;

public class Student {
    private  int score;
    private String surname;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return score == student.score;
    }

    @Override
    public int hashCode() {
        return Objects.hash(score);
    }

    @Override
    public String toString() {
        return "Student{" + "score=" + score + '}';
    }
    public Student(int score, String surname) {
        this.score = score;
        this.surname = surname;
    }
    public int getScore() {
        return this.score;
    }
    public String getSurname() {
        return this.surname;
    }
}
