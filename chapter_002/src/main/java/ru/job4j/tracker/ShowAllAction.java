package ru.job4j.tracker;

public class ShowAllAction implements UserAction {
    @Override
    public String name() {
        return "=== Show all items ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Show all items ====");
        Item[] array = tracker.findAll();
        int value = array.length;
        for (int i = 0; i < value; ++i) {
            System.out.println(array[i].getName());
        }
        return true;
    }
}
