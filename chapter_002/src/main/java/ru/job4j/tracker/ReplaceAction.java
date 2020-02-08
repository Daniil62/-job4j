package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    @Override
    public String name() {
        return "=== Edit item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Edit item ====");
        System.out.print("Enter Id: ");
        String id = input.askStr("Enter Id: ");
        Item item = new Item("");
        if (tracker.replace(id, item)) {
            String name = input.askStr("Enter new name: ");
            item.setName(name);
            System.out.println("Changes made successfully.");
        } else {
            System.out.println("This Id do not exist!");
        }
        return true;
    }
}
