package ru.job4j;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.ItemSorter;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;

public class ItemSorterTest {
    @Test
    public void incOrderTest() {
        List<Item> list = Arrays.asList(new Item("item 2"),
                new Item("item 4"),
                new Item("item 1"),
                new Item("item 5"),
                new Item("item 3"));
        ItemSorter sorter = new ItemSorter();
        List<Item> expected = Arrays.asList(list.get(2),
                list.get(0),
                list.get(4),
                list.get(1),
                list.get(3));
        Assert.assertThat(sorter.incOrder(list), is(expected));
    }
    @Test
    public void decOrderTest() {
        List<Item> list = Arrays.asList(new Item("item 1"),
                new Item("item 2"),
                new Item("item 3"),
                new Item("item 4"),
                new Item("item 5"));
        ItemSorter sorter = new ItemSorter();
        List<Item> expected = Arrays.asList(list.get(4),
                list.get(3),
                list.get(2),
                list.get(1),
                list.get(0));
        Assert.assertThat(sorter.decOrder(list), is(expected));
    }
}
