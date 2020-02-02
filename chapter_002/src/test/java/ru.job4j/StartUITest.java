package ru.job4j;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.tracker.*;
import static org.hamcrest.core.IsNull.nullValue;

import static org.hamcrest.core.Is.is;

public class StartUITest {
    @Test
    public void whenAddItem() {
        String[] answers = {"name"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
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
        StartUI.changeItem(new StubInput(answers), tracker);
        Item replaced = tracker.findById(item.getId());
        Assert.assertThat(replaced.getName(), is("changed item"));
    }
    @Test
    public void whenItemDeleted() {
        Tracker tracker = new Tracker();
        Item item = new Item("unnecessary item");
        tracker.add(item);
        String[] answers = {item.getId()};
        StartUI.deleteItem(new StubInput(answers), tracker);
        Item deleted = tracker.findById(item.getId());
        Assert.assertThat(deleted, is(nullValue()));
    }
}
