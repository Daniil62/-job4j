package ru.job4j.tracker;

import java.util.StringJoiner;

public class StartUI {
    private static void showMenu() {
        StringJoiner sj = new StringJoiner(System.lineSeparator());
        System.out.println("Menu.");
        String[] menu = {"0. Add new Item",
                "1. Show all items", "2. Edit item",
                "3. Delete item", "4. Find item by Id",
                "5. Find items by name",
                "6. Exit Program"};
        for (int i = 0; i < menu.length; ++i) {
            sj.add(menu[i]);
        }
        System.out.println(sj);
    }
    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            showMenu();
            int select = input.askInt("   Select: ", actions.length);
                run = actions[select].execute(input, tracker);
        }
    }
    public static void main(String[] args) {
        UserAction[] actions = {
                new CreateAction(),
                new ShowAllAction(),
                new ReplaceAction(),
                new DeleteAction(),
                new FindByIdAction(),
                new FindByNameAction(),
                new ExitAction()
        };
        Input input = new ValidateInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker, actions);
    }
}
