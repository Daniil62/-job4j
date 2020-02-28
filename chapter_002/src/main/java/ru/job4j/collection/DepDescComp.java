package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int result = 0;
        String[] l = o1.split("/");
        String[] r = o2.split("/");
        for (int i = 0; i < Math.min(l.length, r.length); ++i) {
            if (l[i].compareTo(r[i]) != 0) {
                result = o2.compareTo(o1);
            } else if (o1.length() != o2.length()) {
                result = o1.length() - o2.length();
            }
        }
        return result;
    }
}
