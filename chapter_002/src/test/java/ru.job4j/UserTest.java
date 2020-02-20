package ru.job4j;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.collection.User;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.Is.is;

public class UserTest {
    @Test
    public void whenAsc() {
        Set<User> users = new TreeSet<>();
        users.add(new User("Petr", "Petrov", 33));
        users.add(new User("Ivan", "Ivanov", 32));
        Iterator<User> it = users.iterator();
        Assert.assertThat(it.next(), is(new User("Ivan", "Ivanov", 32)));
        Assert.assertThat(it.next(), is(new User("Petr", "Petrov", 33)));
    }

    @Test
    public void whenComparePertVSIvan() {
        int rsl = new User("Petr", "Petrov", 33).compareTo(
                        new User("Ivan", "Ivanov", 32));
        Assert.assertThat(rsl, greaterThan(0));
    }
    @Test
    public void whenCompareIvanVSIvan() {
        int rsl = new User("Ivan", "Ivanov", 32).compareTo(
                new User("Ivan", "Ivanov", 32));
        Assert.assertThat(rsl, is(0));
    }
    @Test
    public void whenCompareSurnames() {
        int rsl = new User("Ivan", "Ivanov", 32).compareTo(
                new User("Ivan", "Avinov", 32));
        Assert.assertThat(rsl, greaterThan(0));
    }
    @Test
    public void whenCompareAges() {
        int rsl = new User("Ivan", "Ivanov", 32).compareTo(
                new User("Ivan", "Ivanov", 35));
        Assert.assertThat(rsl, lessThan(0));
    }
}
