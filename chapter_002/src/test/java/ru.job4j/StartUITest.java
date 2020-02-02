package ru.job4j;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.tracker.*;

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
}
