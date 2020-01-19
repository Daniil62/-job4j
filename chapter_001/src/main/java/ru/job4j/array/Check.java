package ru.job4j.array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean reference = data[0];
        boolean result = true;
        for (int i = 0; i <= data.length - 1; ++i) {
            if (data[i] != reference) {
                result = false;
                break;
            }
        }
        return result;
    }
}
