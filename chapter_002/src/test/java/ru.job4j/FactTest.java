package ru.job4j;

import org.junit.Test;
import ru.job4j.ex.Fact;

public class FactTest {
    @Test(expected = IllegalArgumentException.class)
    public void excepTest() {
        Fact fact = new Fact();
        fact.calc(0);
    }
}
