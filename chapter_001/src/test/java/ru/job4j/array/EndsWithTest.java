package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;

public class EndsWithTest {
    @Test
    public void endCorrect() {
        char[] word = new char[]{'H', 'e', 'l', 'l', 'o'};
        char[] post = new char[]{'l', 'l', 'o'};
        boolean out = EndsWith.endsWith(word, post);
        Assert.assertThat(out, is(true));
    }
    @Test
    public void endCorrect2() {
        char[] word = new char[]{'H', 'e', 'l', 'l', 'o'};
        char[] post = new char[]{'H', 'e', 'l', 'o'};
        boolean out = EndsWith.endsWith(word, post);
        Assert.assertThat(out, is(false));
    }
    @Test
    public void endCorrect3() {
        char[] word = new char[]{'H', 'e', 'l', 'l', 'o'};
        char[] post = new char[]{'o'};
        boolean out = EndsWith.endsWith(word, post);
        Assert.assertThat(out, is(true));
    }
}
