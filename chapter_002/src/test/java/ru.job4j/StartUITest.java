package ru.job4j;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.tracker.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.IsNull.nullValue;

import static org.hamcrest.core.Is.is;

public class StartUITest {
    @Test
    public void whenAddItem() {
        String[] answers = {"name"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        UserAction create = new CreateAction();
        create.execute(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("name");
        Assert.assertThat(created.getName(), is(expected.getName()));
    }

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        tracker.add(item);
        String[] answers = {item.getId(), "changed item"};
        UserAction replace = new ReplaceAction();
        replace.execute(new StubInput(answers), tracker);
        Item replaced = tracker.findById(item.getId());
        Assert.assertThat(replaced.getName(), is("changed item"));
    }
    @Test
    public void whenItemDeleted() {
        Tracker tracker = new Tracker();
        Item item = new Item("unnecessary item");
        tracker.add(item);
        String[] answers = {item.getId()};
        UserAction delete = new DeleteAction();
        delete.execute(new StubInput(answers), tracker);
        Item deleted = tracker.findById(item.getId());
        Assert.assertThat(deleted, is(nullValue()));
    }
    @Test
    public void whenCheckOutput() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));
        Tracker tracker = new Tracker();
        Item item = new Item("fix bug");
        tracker.add(item);
        ShowAllAction act = new ShowAllAction();
        act.execute(new StubInput(new String[] {}), tracker);
        String expect = ("=== Show all items ====" + System.lineSeparator() + item.getName()
                + System.lineSeparator());
        Assert.assertThat(new String(out.toByteArray()), is(expect));
        System.setOut(def);
    }
    @Test
    public void whenExitTrue() {
        StubInput input = new StubInput(new String[] {"0"});
        StubAction action = new StubAction();
        new StartUI().init(input, new Tracker(), new UserAction[] {action});
        Assert.assertThat(action.isCall(), is(true));
    }
    @Test
    public void whenExitFalse() {
        StubInput input = new StubInput(new String[] {"6"});
        StubAction action = new StubAction();
        new StartUI().init(input, new Tracker(), new UserAction[] {action});
        Assert.assertThat(action.isCall(), is(false));
    }
}
