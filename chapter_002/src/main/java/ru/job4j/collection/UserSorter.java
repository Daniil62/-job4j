package ru.job4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UserSorter {
    public static void main(String[] args) {
        List<User> list = Arrays.asList(new User("G", "A", 30),
                new User("D", "B", 40),
                new User("V", "F", 20));
        Collections.sort(list, new UserIncOrderByName());
        System.out.println("-- sort by names --" + System.lineSeparator() + list);
        Collections.sort(list, new UserDecOrderByName());
        System.out.println("-- reverse sort by names --" + System.lineSeparator() + list);
        Collections.sort(list, new UserIncOrderBySurname());
        System.out.println("-- sort by surnames --" + System.lineSeparator() + list);
        Collections.sort(list, new UserDecOrderBySurname());
        System.out.println("-- reverse sort by surnames --" + System.lineSeparator() + list);
        Collections.sort(list, new UserIncOrderByAge());
        System.out.println("-- sort by ages --" + System.lineSeparator() + list);
        Collections.sort(list, new UserDecOrderByAge());
        System.out.println("-- reverse sort by ages --" + System.lineSeparator() + list);
    }
}
