package ru.job4j.tracker;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "=== Find items by name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Find items by name ====");
        String name = input.askStr("Enter name: ");
        Item[] array = tracker.findByName(name);
        int value = array.length;
        for (int i = 0; i < value; ++i) {
            System.out.println(array[i]);
        }
        return true;
    }
}
