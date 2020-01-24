package ru.job4j.array;

public class Min {
    public static int findMin(int[] array) {
        int result = array[0];
        for (int i = 0; i <= array.length - 1; ++i) {
            if (result > array[i]) {
                result = array[i];
            }
        }
        return result;
    }
}
