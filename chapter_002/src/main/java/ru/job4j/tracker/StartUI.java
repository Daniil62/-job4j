package ru.job4j.tracker;

public class StartUI {
    private static int showMenu() {
        Input input = new ConsoleInput();
        int select =  input.askInt("Menu." + System.lineSeparator()
                + "0. Add new Item" + System.lineSeparator()
                + "1. Show all items" + System.lineSeparator()
                + "2. Edit item" + System.lineSeparator()
                + "3. Delete item" + System.lineSeparator()
                + "4. Find item by Id" + System.lineSeparator()
                + "5. Find items by name" + System.lineSeparator()
                + "6. Exit Program" + System.lineSeparator()
                + "   Select:" + System.lineSeparator());
        return select;
    }
    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            int select = showMenu();
            if (select >= actions.length || select < 0) {
                System.out.println("Goodbye.");
                run = false;
                break;
            } else {
                run = actions[select].execute(input, tracker);
            }
        }
    }
    public static void main(String[] args) {
        UserAction[] actions = {
                new CreateAction(),
                new ShowAllAction(),
                new ReplaceAction(),
                new DeleteAction(),
                new FindByIdAction(),
                new FindByNameAction()
        };
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker, actions);
    }
}
