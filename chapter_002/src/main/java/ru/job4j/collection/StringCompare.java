package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
        int result = 0;
        int leftSize = o1.length();
        int rightSize = o2.length();
        int size = Math.min(leftSize, rightSize);
        for (int i = 0; i < size; ++i) {
            char left = o1.charAt(i);
            char right = o2.charAt(i);
            result += Character.compare(left, right);
            }
        if (leftSize < rightSize) {
            result -= (rightSize - size);
        }
        if (leftSize > rightSize) {
            result += (leftSize - size);
        }
        return result;
    }
}
