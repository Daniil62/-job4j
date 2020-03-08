package ru.job4j.streamapi.student;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private int score;
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return score == student.score && Objects.equals(name, student.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }
    @Override
    public int compareTo(Student o) {
        int result = Integer.compare(o.getScore(), this.score);
        if (result == 0) {
            result = this.getName().compareTo(o.getName());
        }
        return result;
    }
    public String getName() {
        return name;
    }
    public int getScore() {
        return score;
    }
}
