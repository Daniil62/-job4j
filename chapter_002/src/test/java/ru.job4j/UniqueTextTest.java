package ru.job4j;

import org.junit.Test;
import ru.job4j.collection.UniqueText;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class UniqueTextTest {

    @Test
    public void isEquals() {
        String origin = "My cat eats a mouse";
        String text = "My cat eats a mouse";
        assertThat(UniqueText.isEquals(origin, text), is(true));
    }

    @Test
    public void isNotEquals() {
        String origin = "My cat eats a mouse";
        String text = "A mouse is eaten by a cat";
        assertThat(UniqueText.isEquals(origin, text), is(false));
    }
    @Test
    public void isEquals2() {
        String origin = "My cat catch a mouse every day";
        String text = "My cat catch a mouse";
        assertThat(UniqueText.isEquals(origin, text), is(true));
    }

    @Test
    public void isNotEquals2() {
        String origin = "My cat catch a mouse";
        String text = "My cat can catch a mouse";
        assertThat(UniqueText.isEquals(origin, text), is(false));
    }
}
