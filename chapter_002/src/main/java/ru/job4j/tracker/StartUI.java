package ru.job4j.tracker;

public class StartUI {
    private String name;
    private static int showMenu() {
        ConsoleInput input = new ConsoleInput();
        int result =  input.askInt("Menu." + System.lineSeparator()
                + "0. Add new Item" + System.lineSeparator()
                + "1. Show all items" + System.lineSeparator()
                + "2. Edit item" + System.lineSeparator()
                + "3. Delete item" + System.lineSeparator()
                + "4. Find item by Id" + System.lineSeparator()
                + "5. Find items by name" + System.lineSeparator()
                + "6. Exit Program" + System.lineSeparator()
                + "   Select:" + System.lineSeparator());
        return result;
    }
    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
        System.out.println("Your Id: " + item.getId());
    }
    public static void showAllItems(Input input, Tracker tracker) {
        System.out.println("=== Show all items ====");
        Item[] array = tracker.findAll();
        int value = array.length;
        for (int i = 0; i < value; ++i) {
            System.out.println(array[i].getName());
        }
    }
    public static void changeItem(Input input, Tracker tracker) {
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
    }
    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Delete item ====");
        String id = input.askStr("Enter Id: ");
        if (tracker.delete(id)) {
            System.out.println("Data was successfully deleted.");
        } else {
            System.out.println("This Id do not exist!");
        }
    }
    public static void findItemById(Input input, Tracker tracker) {
        System.out.println("=== Find item by Id ====");
        String id = input.askStr("Enter Id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item.getName());
        } else {
            System.out.println("This Id do not exist!");
        }
    }
    public static void showItemsWithName(Input input, Tracker tracker) {
        System.out.println("=== Find items by name ====");
        String name = input.askStr("Enter name: ");
        Item[] array = tracker.findByName(name);
        int value = array.length;
        for (int i = 0; i < value; ++i) {
            System.out.println(array[i]);
        }
    }
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            int select = showMenu();
            if (select == 0) {
                createItem(input, tracker);
            } else if (select == 1) {
                showAllItems(input, tracker);
            } else if (select == 2) {
                changeItem(input, tracker);
            } else if (select == 3) {
                deleteItem(input, tracker);
            } else if (select == 4) {
                findItemById(input, tracker);
            } else if (select == 5) {
                showItemsWithName(input, tracker);
            } else if (select == 6) {
                run = false;
            } else {
                System.out.println("Incorrectly entered command!");
            }
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
