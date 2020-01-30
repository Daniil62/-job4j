package ru.job4j;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

public class TrackerTest {
    @Test
    public void itemAddTest() {
        Item[] array = new Item[1];
        Item item = new Item("job4j");
        array[0] = item;
        Tracker tracker = new Tracker();
        tracker.add(item);
        Assert.assertThat(array, is(tracker.findAll()));
    }
    @Test
    public void itemFindByNameTest() {
        Item[] array = new Item[1];
        Item item = new Item("job4j");
        array[0] = item;
        Tracker tracker = new Tracker();
        tracker.add(item);
        Assert.assertThat(array, is(tracker.findByName("job4j")));
    }
    @Test
    public void itemFindByIdTest() {
        Item item = new Item("job4j");
        Tracker tracker = new Tracker();
        tracker.add(item);
        String id = item.getId();
        Assert.assertThat(item, is(tracker.findById(id)));
    }
    @Test
    public void whenReplace() {
        Tracker tracker = new Tracker();
        Item item = new Item("Old item");
        tracker.add(item);
        String id = item.getId();
        Item freshItem = new Item("This is new item after replace");
        tracker.replace(id, freshItem);
        Assert.assertThat(tracker.findById(id).getName(), is("This is new item after replace"));
    }
    @Test
    public void whenDelete() {
        Tracker tracker = new Tracker();
        Item item = new Item("Test");
        tracker.add(item);
        String id = item.getId();
        tracker.delete(id);
        Assert.assertThat(tracker.findById(id), is(nullValue()));
    }
}
