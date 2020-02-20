package ru.job4j;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.collection.User;
import ru.job4j.collection.UserIncOrderByAge;
import ru.job4j.collection.UserIncOrderByName;
import ru.job4j.collection.UserIncOrderBySurname;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;

import java.util.Comparator;

import static org.hamcrest.core.Is.is;

public class UserSorterTest {
    @Test
    public void whenComparatorByNameLessThan0() {
        Comparator<User> IncName = new UserIncOrderByName().thenComparing(new UserIncOrderByName());
        int out = IncName.compare(new User("D", "S", 34),
                new User("V", "B", 40));
        Assert.assertThat(out, lessThan(0));
    }
    @Test
    public void whenComparatorByNameIs0() {
        Comparator<User> IncName = new UserIncOrderByName().thenComparing(new UserIncOrderByName());
        int out = IncName.compare(new User("D", "S", 34),
                new User("D", "B", 40));
        Assert.assertThat(out, is(0));
    }
    @Test
    public void whenComparatorByNameGreaterThan0() {
        Comparator<User> IncName = new UserIncOrderByName().thenComparing(new UserIncOrderByName());
        int out = IncName.compare(new User("D", "S", 34),
                new User("A", "B", 40));
        Assert.assertThat(out, greaterThan(0));
    }
    @Test
    public void whenComparatorByNameAndSurnameLessThan0() {
        Comparator<User> IncName = new UserIncOrderByName().thenComparing(new UserIncOrderBySurname());
        int out = IncName.compare(new User("D", "S", 34),
                new User("V", "E", 40));
        Assert.assertThat(out, lessThan(0));
    }
    @Test
    public void whenComparatorByNameAndSurnameIs0() {
        Comparator<User> IncName = new UserIncOrderByName().thenComparing(new UserIncOrderBySurname());
        int out = IncName.compare(new User("D", "S", 34),
                new User("D", "S", 40));
        Assert.assertThat(out, is(0));
    }
    @Test
    public void whenComparatorByNameAndSurnameGreaterThan0() {
        Comparator<User> IncName = new UserIncOrderByName().thenComparing(new UserIncOrderBySurname());
        int out = IncName.compare(new User("D", "S", 34),
                new User("A", "E", 40));
        Assert.assertThat(out, greaterThan(0));
    }
    @Test
    public void whenComparatorByAgeLessThan0() {
        Comparator<User> IncName = new UserIncOrderByAge().thenComparing(new UserIncOrderByAge());
        int out = IncName.compare(new User("D", "S", 34),
                new User("V", "B", 40));
        Assert.assertThat(out, lessThan(0));
    }
    @Test
    public void whenComparatorByAgeIs0() {
        Comparator<User> IncName = new UserIncOrderByAge().thenComparing(new UserIncOrderByAge());
        int out = IncName.compare(new User("D", "S", 34),
                new User("V", "B", 34));
        Assert.assertThat(out, is(0));
    }
    @Test
    public void whenComparatorByAgeGreaterThen0() {
        Comparator<User> IncName = new UserIncOrderByAge().thenComparing(new UserIncOrderByAge());
        int out = IncName.compare(new User("D", "S", 34),
                new User("V", "B", 30));
        Assert.assertThat(out, greaterThan(0));
    }
}
