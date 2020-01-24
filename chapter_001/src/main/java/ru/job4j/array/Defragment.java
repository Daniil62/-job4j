package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int i = 0; i < array.length; ++i) {
            if (array[i] == null) {
                int search = i;
                while (array[search] == null && search < array.length - 1) {
                    ++search;
                    if (array[search] != null) {
                        array[i] = array[search];
                        array[search] = null;
                        break;
                    }
                }
            }
            System.out.print(array[i]);
        }
        return array;
    }
}

