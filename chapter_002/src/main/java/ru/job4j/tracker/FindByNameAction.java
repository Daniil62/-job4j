package ru.job4j.tracker;

import java.util.List;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "=== Find items by name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Find items by name ====");
        String name = input.askStr("Enter name: ");
        List<Item> array = tracker.findByName(name);
        int count = 0;
        int value = array.size();
        for (int i = 0; i < value; ++i) {
            System.out.println(array.get(i));
        }
        if (value == 0) {
            System.out.println("   Nothing found.");
        }
        return true;
    }
}
