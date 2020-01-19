package ru.job4j.array;

public class Square {
    public int[] calculate(int bound) {
        int insert = 1;
        int[] result = new int[bound];
        for(int i = 0; i <= bound - 1; ++i) {
            result[i] = insert * insert;
            ++ insert;
        }
        return result;
    }
}
