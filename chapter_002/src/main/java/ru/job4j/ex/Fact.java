package ru.job4j.ex;

public class Fact {
    public int calc(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Argument is less than minimal value.");
        }
        int rsl = 1;
        for (int index = 1; index != n; index++) {
            rsl += index;
        }
        return rsl;
    }
    public static void main(String[] args) {
    }
}
