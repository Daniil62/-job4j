package ru.job4j.tracker;

public class ExitAction implements UserAction {
    @Override
    public String name() {
        return "    Goodbye.";
    }
    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println(name());
        return false;
    }
}

