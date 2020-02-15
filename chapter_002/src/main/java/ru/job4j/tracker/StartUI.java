package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class StartUI {
    private static void showMenu(int actions) {
        StringJoiner sj = new StringJoiner(System.lineSeparator());
        System.out.println("Menu.");
        String[] menu = {"0. Add new Item",
                "1. Show all items", "2. Edit item",
                "3. Delete item", "4. Find item by Id",
                "5. Find items by name",
                "6. Exit Program"};
        for (int i = 0; i < actions; ++i) {
            sj.add(menu[i]);
        }
        System.out.println(sj);
    }
    public void init(Input input, Tracker tracker, List<UserAction> actions) {
        boolean run = true;
        while (run) {
            showMenu(actions.size());
            int select = input.askInt("   Select: ", actions.size());
                run = actions.get(select).execute(input, tracker);
        }
    }
    public static void main(String[] args) {
        ArrayList<UserAction> actions = new ArrayList<>();
        actions.add(new CreateAction());
        actions.add(new ShowAllAction());
        actions.add(new ReplaceAction());
        actions.add(new DeleteAction());
        actions.add(new FindByIdAction());
        actions.add(new FindByNameAction());
        actions.add(new ExitAction());
        Input input = new ConsoleInput();
        Input validate = new ValidateInput(input);
        Tracker tracker = new Tracker();
        new StartUI().init(validate, tracker, actions);
    }
}
