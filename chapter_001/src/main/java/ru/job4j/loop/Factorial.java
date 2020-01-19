package ru.job4j.loop;

public class Factorial {
    public int factorialiser(int value) {
    int result = 1;
    for (int i = value; i > 0; --i) {
        result *= i;
    }
    return result;
    }
}
