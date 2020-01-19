package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;

public class ArrayCharTest {
    @Test
    public void beginCorrect() {
        char[] word = new char[]{'H', 'e', 'l', 'l', 'o'};
        char[] pref = new char[]{'H', 'e', 'l'};
        boolean out = ArrayChar.startsWith(word, pref);
        Assert.assertThat(out, is(true));
    }
    @Test
    public void beginCorrect2() {
        char[] word = new char[]{'H', 'e', 'l', 'l', 'o'};
        char[] pref = new char[]{'H', 'a', 'l'};
        boolean out = ArrayChar.startsWith(word, pref);
        Assert.assertThat(out, is(false));
    }
    @Test
    public void beginCorrect3() {
        char[] word = new char[]{'H', 'e', 'l', 'l', 'o'};
        char[] pref = new char[]{'h'};
        boolean out = ArrayChar.startsWith(word, pref);
        Assert.assertThat(out, is(false));
    }
    @Test
    public void beginCorrect4() {
        char[] word = new char[]{'H', 'e', 'l', 'l', 'o'};
        char[] pref = new char[]{'H', 'a', 'l', 'l', 'o', 'o'};
        boolean out = ArrayChar.startsWith(word, pref);
        Assert.assertThat(out, is(false));
    }
    @Test
    public void beginCorrect5() {
        char[] word = new char[]{'H', 'e', 'l', 'l', 'o'};
        char[] pref = new char[]{'H', 'e', 'l', 'l', 'o', 'o', 'o', 'o'};
        boolean out = ArrayChar.startsWith(word, pref);
        Assert.assertThat(out, is(true));
    }
}
