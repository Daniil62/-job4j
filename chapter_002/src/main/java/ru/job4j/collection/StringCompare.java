package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int leftSize = o1.length();
        int rightSize = o2.length();
        int result = leftSize - rightSize;
        int size = Math.min(leftSize, rightSize);
        for (int i = 0; i < size; ++i) {
            char left = o1.charAt(i);
            char right = o2.charAt(i);
            if (left != right) {
                result = Character.compare(left, right);
                break;
            }
        }
        return result;
    }
}
