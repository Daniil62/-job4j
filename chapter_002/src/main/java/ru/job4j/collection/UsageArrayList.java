package ru.job4j.collection;

import java.util.ArrayList;

public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add(0, "Ivan");
        names.add(1, "Matvej");
        names.add(2, "Vovan");
        for (Object value : names) {
            System.out.println(value);
        }
    }
}
