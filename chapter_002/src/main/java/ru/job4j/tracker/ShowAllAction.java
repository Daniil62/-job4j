package ru.job4j.tracker;

import java.util.List;

public class ShowAllAction implements UserAction {
    @Override
    public String name() {
        return "=== Show all items ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Show all items ====");
        List<Item> array = tracker.findAll();
        int value = array.size();
        for (int i = 0; i < value; ++i) {
            System.out.println(array.get(i).getName());
        }
        return true;
    }
}

