package ru.job4j.array;

public class FindLoop {
    public int indexOf(int[] data, int element) {
        int result = -1;
        for(int i = 0; i <= data.length - 1; ++i) {
            if(element == data[i]) {
                result = i;
            }
        }
        return result;
    }
}
