package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Scanner;

public class StartUI {
    private String name;
    private void showMenu() {
        System.out.println("Menu." + System.lineSeparator()
                + "0. Add new Item" + System.lineSeparator()
                + "1. Show all items" + System.lineSeparator()
                + "2. Edit item" + System.lineSeparator()
                + "3. Delete item" + System.lineSeparator()
                + "4. Find item by Id" + System.lineSeparator()
                + "5. Find items by name" + System.lineSeparator()
                + "6. Exit Program" + System.lineSeparator()
                + "   Select:" + System.lineSeparator());
    }
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
                System.out.println("Your Id: " + item.getId());
            } else if (select == 1) {
                System.out.println("=== Show all items ====");
                Item[] array = tracker.findAll();
                int value = array.length;
                for (int i = 0; i < value; ++i) {
                    System.out.println(array[i].getName());
                }
            } else if (select == 2) {
                System.out.println("=== Edit item ====");
                System.out.print("Enter Id: ");
                String id = scanner.nextLine();
                Item item = new Item("");
                if (tracker.replace(id, item)) {
                    System.out.print("Enter new name: ");
                    name = scanner.nextLine();
                    item.setName(name);
                    System.out.println("Changes made successfully.");
                } else {
                    System.out.println("This Id do not exist!");
                }

            } else if (select == 3) {
                System.out.println("=== Delete item ====");
                System.out.print("Enter Id: ");
                name = scanner.nextLine();
                if (tracker.delete(name)) {
                    System.out.println("Data was successfully deleted.");
                } else {
                    System.out.println("This Id do not exist!");
                }
            } else if (select == 4) {
                System.out.println("=== Find item by Id ====");
                System.out.print("Enter Id: ");
                name = scanner.nextLine();
                Item item = tracker.findById(name);
                if (item != null) {
                    System.out.println(item.getName());
                } else {
                    System.out.println("This Id do not exist!");
                }
            } else if (select == 5) {
                System.out.println("=== Find items by name ====");
                System.out.print("Enter name: ");
                name = scanner.nextLine();
                Item[] array = tracker.findByName(name);
                int value = array.length;
                for (int i = 0; i < value; ++i) {
                    System.out.println(array[i]);
                }
            } else if (select == 6) {
                run = false;
            } else {
                System.out.println("Incorrectly entered command!");
            }
        }
    }

    public static void main(String[] args) {
        StartUI start = new StartUI();
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        start.init(scanner, tracker);
    }
}
